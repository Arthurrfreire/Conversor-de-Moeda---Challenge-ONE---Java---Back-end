package src.currencyconverter;
import com.google.gson.Gson;
import java.util.Map;

public class CurrencyData {
    private String base_code; // Nome do campo correspondente à base
    private Map<String, Double> conversion_rates; // Nome correto para as taxas

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public static CurrencyData fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CurrencyData.class);
    }
}