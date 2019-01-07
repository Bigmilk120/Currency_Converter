package default_package;

import java.awt.Dimension;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class liveRequest {
	public static final String ACCESS_KEY = "5794ecf11594dd5c16b5c4b84eb38336";
    public static final String BASE_URL = "http://apilayer.net/api/";
    public static final String ENDPOINT = "live";
    static CloseableHttpClient httpClient = HttpClients.createDefault();
	static JLabel label = new JLabel("Live Currency Exchange Rates");

    
	public static void sendLiveRequest(String currency, Double amount){

		JFrame myFrame = gui.getFrame();
		JPanel mainPanel = gui.getPanel();
		
        HttpGet get = new HttpGet(BASE_URL + ENDPOINT + "?access_key=" + ACCESS_KEY);

        try {
            CloseableHttpResponse response =  httpClient.execute(get);
            HttpEntity entity = response.getEntity();

            JSONObject exchangeRates = new JSONObject(EntityUtils.toString(entity));
    		mainPanel.add(label);


            Date timeStampDate = new Date((long)(exchangeRates.getLong("timestamp")*1000)); 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
            String formattedDate = dateFormat.format(timeStampDate);
            JLabel labelAmount = new JLabel(amount+" " + exchangeRates.getString("source") + " in "+currency+" : " + amount*exchangeRates.getJSONObject("quotes").getDouble("USD"+currency) + " (Date: " + formattedDate + ")");   
            mainPanel.add(labelAmount);
            response.close();
            myFrame.setVisible(true);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
