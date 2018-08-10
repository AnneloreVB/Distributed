
package com.example.domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONObject;
import sun.net.www.protocol.http.HttpURLConnection;

public class MovieRetriever {
    
    public String getInfo(String title){
        String result = null;
        try{
            String tus = title.replaceAll(" ", "%20");
            String url ="http://www.omdbapi.com/?apikey=ac13c297&t="+tus;
            URL object = new URL(url);
            HttpURLConnection con = (HttpURLConnection)object.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = con.getResponseCode();
           
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputline;
            StringBuffer response = new StringBuffer();
            
            while((inputline = in.readLine()) != null){
                response.append(inputline);
                System.out.println(response);
            }
            JSONObject obj = new JSONObject(response.toString());
            result = obj.toString();
            System.out.println(result);
          
        }
        catch(Exception ex){
            
        }
        return result;
    }
}
