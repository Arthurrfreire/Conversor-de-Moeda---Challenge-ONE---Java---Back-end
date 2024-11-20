package src.currencyconverter;

import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public void showMenu(Map<String, Double> rates) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******************************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda =]");
            System.out.println();
            System.out.println("1) Dólar >> Peso argentino");
            System.out.println("2) Peso argentino >> Dólar");
            System.out.println("3) Dólar >> Real brasileiro");
            System.out.println("4) Real brasileiro >> Dólar");
            System.out.println("5) Dólar >> Peso colombiano");
            System.out.println("6) Peso colombiano >> Dólar");
            System.out.println("7) Sair");
            System.out.println();
            System.out.println("Escolha uma opção válida: ");
            System.out.println("******************************************");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    convert(rates, "USD", "ARS");
                    break;
                case "2":
                    convert(rates, "ARS", "USD");
                    break;
                case "3":
                    convert(rates, "USD", "BRL");
                    break;
                case "4":
                    convert(rates, "BRL", "USD");
                    break;
                case "5":
                    convert(rates, "USD", "COP");
                    break;
                case "6":
                    convert(rates, "COP", "USD");
                    break;
                case "7":
                    System.out.println("Encerrando o programa. Obrigado por usar o Conversor de Moedas!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void convert(Map<String, Double> rates, String fromCurrency, String toCurrency) {
        Scanner scanner = new Scanner(System.in);

        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            System.out.println("Erro: Moedas não disponíveis.");
            return;
        }

        System.out.print("Digite o valor a ser convertido: ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Por favor, insira um número.");
            return;
        }

        double fromRate = rates.get(fromCurrency);
        double toRate = rates.get(toCurrency);
        double convertedValue = (amount / fromRate) * toRate;

        System.out.printf("Resultado: %.2f %s é equivalente a %.2f %s%n", amount, fromCurrency, convertedValue, toCurrency);
        System.out.println("--------------------------------------");
    }
}
