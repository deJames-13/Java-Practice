package tuts.ControlFlow;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         * FOR LOOP FORMAT
         * for (int i=0; boolean; increment){code block}
         */
        for (int i = 10; i > 0; i--) {
            System.out.println("Hello World " + i);
        }
        /*
         * WHILE LOOP FORMAT
         * while (condition){
         * code block
         * (always add a condition breaker)
         * }
         */
        int x = 10;
        while (x > 0) {
            System.out.println(x);
            x--;
        }
        String input = "";
        try (Scanner scan = new Scanner(System.in)) {
            while (!input.equals("quit")) {
                System.out.print("Type Something: ");
                input = scan.next().toLowerCase();
                System.out.println(input);
            }
            /*
             * DO-WHILE LOOP FORMAT
             * do {
             * code block
             * }
             * while (condition);
             */
        }

    }
}
