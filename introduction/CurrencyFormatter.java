import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

/**
 * Java Currency Formatter
 * To convert a double number formatted according to the appropriate Locale's currency
 */
public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // custom Locale for India
        Locale localeIndia = new Locale("en", "IN");

        String us = (NumberFormat.getCurrencyInstance(Locale.US)).format(payment);
        String india = (NumberFormat.getCurrencyInstance(localeIndia)).format(payment);
        String china = (NumberFormat.getCurrencyInstance(Locale.CHINA)).format(payment);
        String france = (NumberFormat.getCurrencyInstance(Locale.FRANCE)).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
