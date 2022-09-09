package tuts.DataTypes;

import java.text.NumberFormat;

public class JavaFormatting {
    public static void main(String[] args) {
        // NumberFormat - abstract class
        /*
         * getCurrencyInstance() for currencies
         * getPercentInstance() for percentage
         * 
         */
        String res;
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        res = curr.format(123456.6969);
        System.out.println(res);
        NumberFormat percent = NumberFormat.getPercentInstance();
        res = percent.format(0.6969);
        // Method Chaining - NumberFormat.getPercentInstance().format(0.6969);
        System.out.println(res);
    }
}
