package Serverandclient;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApacheAPIReadingFromWebPage {
    public static void main(String[] args){
 CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpGet request= new HttpGet("https://www.jumia.com.ng/");
        request.addHeader("User-Agent", "Chrome");

        try( CloseableHttpResponse response= httpClient.execute(request)){
            System.out.println("response: "+ response.getCode());

            BufferedReader reader= new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String reading;
            if((reading= reader.readLine()) != null){
                System.out.println(reading);
            }
        }catch(IOException e){
            System.out.println("IOException thrown "+ e.getMessage());

        }
    }
}
