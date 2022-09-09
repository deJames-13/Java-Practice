package tuts.exercise;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalc {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("******************************");
            System.out.println("*     Mortgage Calculator    *");
            System.out.println("******************************\n");

            double principal, annualRate, monthlyInterest;
            final byte MONTHS = 12;
            final byte PERCENT = 100;

            System.out.print("Principal: ");
            principal = scan.nextDouble();
            System.out.print("Annual Interest Rate: ");
            annualRate = (double) ((scan.nextDouble() / PERCENT) / MONTHS);
            System.out.print("Period (Years): ");
            monthlyInterest = scan.nextDouble() * MONTHS;

            double mortgageValue = (principal
                    * ((annualRate * Math.pow((double) (1 + annualRate), monthlyInterest))
                            / (Math.pow((double) (1 + annualRate), monthlyInterest) - 1)));
            String result = NumberFormat.getCurrencyInstance().format(mortgageValue);
            System.out.println("Mortgage: " + result);
        }
        System.out.println("\n******************************");

    }
}
