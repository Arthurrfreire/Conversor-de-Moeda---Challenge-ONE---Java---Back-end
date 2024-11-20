package src.currencyconverter;

import com.google.gson.Gson;
import java.util.Map;

public class CurrencyData {
    private String base;
    private Map<String, Double> rates; // Contém as taxas de câmbio

    public static CurrencyData fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CurrencyData.class);
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}