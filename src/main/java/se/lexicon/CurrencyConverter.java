package se.lexicon;


import static se.lexicon.DisplayResults.displayResults;

public class CurrencyConverter {

    public static void convertSEKtoUSD(double amount) {
        double convertedAmount = amount * ExchangeRates.SEKtoUSDRate;
        displayResults(amount, convertedAmount, "SEK", "USD");
    }

    public static void convertUSDtoSEK(double amount) {
        double convertedAmount = amount * ExchangeRates.USDtoSEKRate;
        displayResults(amount, convertedAmount, "USD", "SEK");
    }

    public static void convertSEKtoEuro(double amount) {
        double convertedAmount = amount * ExchangeRates.SEKtoEuroRate;
        displayResults(amount, convertedAmount, "SEK", "Euro");
    }

    public static void convertEurotoSEK(double amount) {
        double convertedAmount = amount * ExchangeRates.EurotoSEKRate;
        displayResults(amount, convertedAmount, "Euro", "SEK");

    }
}
