package tuts.ControlFlow;

public class ComparisonOperators {
    public static void main(String[] args) {
        int x = 1, y = 1;
        /*
         * BOOLEAN OPERATORS
         * == compares if 2 values are equal;
         * != compares if 2 values is not equal
         * <= less than or equal
         * >= greater than or equal to
         * 
         * LOGICAL OPERATORS
         * && - and operator
         * || - or operator
         * ! - not operator returns an opposite boolean value
         */
        System.out.println((x == y || x >= y) && y >= x);
    }
}
