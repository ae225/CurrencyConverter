package se.lexicon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayResults {
    static void displayResults(double amount, double convertedAmount, String fromCurrency, String toCurrency) {
        String dateTime = getdateTime();
        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency + " at " + dateTime);
    }

    private static String getdateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
