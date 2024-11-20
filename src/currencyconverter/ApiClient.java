package src.currencyconverter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import io.github.cdimascio.dotenv.Dotenv;

public class ApiClient {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_KEY = dotenv.get("API_KEY");
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    public String fetchExchangeRates() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body(); // Retorna o JSON da API
    }
}
