package src.currencyconverter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();

        try {
            String json = apiClient.fetchExchangeRates();
            CurrencyData currencyData = CurrencyData.fromJson(json);

            Map<String, Double> rates = currencyData.getRates();

            CurrencyConverter converter = new CurrencyConverter();
            converter.convertCurrency(rates);
        } catch (Exception e) {
            System.out.println("Erro ao obter os dados de câmbio: " + e.getMessage());
        }
    }
}