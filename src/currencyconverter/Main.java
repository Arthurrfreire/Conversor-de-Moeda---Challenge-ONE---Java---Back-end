package src.currencyconverter;

import java.util.Map;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();

        try {
            String json = apiClient.fetchExchangeRates();
            CurrencyData currencyData = CurrencyData.fromJson(json);

            if (currencyData.getConversionRates() == null) {
                logger.warning("Erro: 'conversion_rates' está null. Verifique a resposta da API.");
                return;
            }

            Map<String, Double> rates = currencyData.getConversionRates();
            System.out.printf("Taxas de câmbio carregadas com sucesso: %s%n", rates);

            CurrencyConverter converter = new CurrencyConverter();
            converter.showMenu(rates);
        } catch (Exception e) {
            logger.severe("Erro ao obter os dados de câmbio: " + e.getMessage());
        }
    }
}
