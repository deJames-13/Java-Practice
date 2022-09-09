package tuts.ControlFlow;

public class IfStatements {
    public static void main(String[] args) {
        // If statements format
        /*
         * if (condition){code block}
         * if (condition) code line;
         */
        int temperature;
        temperature = 30;
        if (temperature >= 30) {
            System.out.println("Its hot today!");
        } else if (temperature > 20)
            System.out.println("Its A Good Day!");
        else
            System.out.println("Its cold!");

        // TERNARY OPERATORS
        /*
         * SHORTCUITS
         * 
         * (condition) ? (then execute) : (else execute this)
         * 
         */

        int income = 120_000;
        String className = income > 100_000 ? "First" : "Second";
        System.out.println(className);

    }
}
