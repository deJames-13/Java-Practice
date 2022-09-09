package tuts.DataTypes;

public class VariableSwapping {
    public static void main(String[] args) {
        // To swap variables asign an empty var and use at as a temporary placeholder
        String temp;
        String a = "This is a";
        String b = "This is b";
        System.out.println(a + "\n" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "\n" + b);

    }
}
