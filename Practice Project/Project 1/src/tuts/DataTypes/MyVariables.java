package tuts.DataTypes;

public class MyVariables {
    // Variable Naming Convention
    // Pascal Naming: MyName - is used for classes
    // Camel Case: myName - for variables and methods

    // Data Types

    /*
     * Primitives - stores data, faster
     * boolean 1 bit true or false
     * byte 1 byte
     * short 2 bytes
     * int 4 bytes
     * long 8 bytes
     * float 4 bytes decimal values up to 6-7
     * double 8 bytes decimal values up to 15
     * char 2 bytes single character/letter/ascii
     * 
     * Reference - stores address
     * String varies,
     * 
     */

    public static void main(String[] args) {
        int i = 123;
        float f = 6.9f; // add a prefix f at the end
        boolean b = true;
        char c = 'A'; // always single quotes
        String str = "this is a string";

        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Booleans: " + b);
        System.out.println("Characters: " + c);
        System.out.println("String: " + str);

        // Constants - immutable variables / cannot change values
        final float pi = 3.14f;
        System.out.println(pi);
    }

}
