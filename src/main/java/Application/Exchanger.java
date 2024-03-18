package Application;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchanger {
        // you need to have and account to get this keep to make calls for REST API


        //method which will convert amount from one currency to another
        public static String getConvert(String fromCurrency, String toCurrency, String amount) throws Exception{

        // you need to have and account to get this keep to make calls for REST API
        String yourAPIkey = "";
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.apilayer.com/exchangerates_data/convert" +
                        "?to=" + toCurrency +
                        "&from=" + fromCurrency +
                        "&amount=" + amount))
                .header("apikey", yourAPIkey)
                .GET()
                .build();

        //declaration and initialization of client
        HttpClient httpClient = HttpClient.newHttpClient();

        //declaration and initialization of response
        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());


        //next we need to read data that we got using Gson from Gson library
        Gson gson = new Gson();


        //Getting results
        Results results = new Results();
        results = gson.fromJson(getResponse.body(), Results.class);

        return results.getResult();
    }
}
