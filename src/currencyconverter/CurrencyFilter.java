package src.currencyconverter;

import java.util.Map;

public class CurrencyFilter {
    public void listAvailableCurrencies(Map<String, Double> rates) {
        System.out.println("Moedas disponíveis:");
        rates.keySet().forEach(System.out::println);
    }
}

