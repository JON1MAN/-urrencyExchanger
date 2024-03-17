package Application;

public class Main {

    public static void main(String[] args) throws Exception{

//        String to = "USD";
//        String from = "EUR";
//        double amount = 100.0;
//
//
//        HttpRequest getRequest = HttpRequest.newBuilder()
//                .uri(new URI("https://api.apilayer.com/exchangerates_data/convert" +
//                        "?to=" + to +
//                        "&from=" + from +
//                        "&amount=" + amount))
//                .header("apikey", "")
//                .GET()
//                .build();
//
//        HttpClient httpClient = HttpClient.newHttpClient();
//
//        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
//
//        Gson gson = new Gson();
//
//        Results results = new Results();
//        results = gson.fromJson(getResponse.body(), Results.class);
//        System.out.println(results.getResult());
//        //System.out.println(getResponse.body());


        GUI gui = new GUI();
    }
}
