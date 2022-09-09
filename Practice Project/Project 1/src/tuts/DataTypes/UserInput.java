package tuts.DataTypes;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Name: ");
            String name = scan.nextLine().trim();
            System.out.println("You are " + name + ".");
        }
    }
}
