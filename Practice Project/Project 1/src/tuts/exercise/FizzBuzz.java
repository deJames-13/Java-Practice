package tuts.exercise;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Number: ");
            int value = scan.nextInt();
            if (value % 3 == 0 && value % 5 == 0)
                System.out.println("FizzBuzz");
            else if (value % 5 == 0)
                System.out.println("Fizz");
            else if (value % 3 == 0)
                System.out.println("Buzz");
            else
                System.out.println(value);
        }

    }
}
