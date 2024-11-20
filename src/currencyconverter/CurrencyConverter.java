package src.currencyconverter;

import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public void convertCurrency(Map<String, Double> rates) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao Conversor de Moedas!");
            System.out.println("Digite a moeda de origem (ex: USD) ou 'sair' para encerrar:");
            String fromCurrency = scanner.nextLine().trim().toUpperCase();

            if (fromCurrency.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa. Obrigado por usar o Conversor de Moedas!");
                break;
            }

            if (!rates.containsKey(fromCurrency)) {
                System.out.println("Moeda de origem inválida. Tente novamente.");
                continue;
            }

            System.out.println("Digite a moeda de destino (ex: BRL):");
            String toCurrency = scanner.nextLine().trim().toUpperCase();

            if (!rates.containsKey(toCurrency)) {
                System.out.println("Moeda de destino inválida. Tente novamente.");
                continue;
            }

            System.out.println("Digite o valor a ser convertido:");
            double amount;
            try {
                amount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Por favor, insira um número.");
                continue;
            }

            double fromRate = rates.get(fromCurrency);
            double toRate = rates.get(toCurrency);
            double convertedValue = (amount / fromRate) * toRate;

            System.out.printf("Resultado: %.2f %s é equivalente a %.2f %s%n", amount, fromCurrency, convertedValue, toCurrency);
            System.out.println("--------------------------------------");
        }
    }
}