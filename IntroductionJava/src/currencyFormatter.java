import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class currencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        Locale indiaLocale = new Locale("en","IN");

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US:  "+US.format(d));
        System.out.println("India: " + india.format(d));
        System.out.println("CHINA:  "+china.format(d));
        System.out.println("FRANCE:  "+france.format(d));

    }
}
