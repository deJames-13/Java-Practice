package tuts.DataTypes;

public class ArithmeticComp {
    public static void main(String[] args) {
        // Implicit casting
        // means that any data types can be cast into another depending on its positon
        // byte > short > int > long > float > double
        // Exlpicit casting is done by using (data type) before the data

        int result;
        result = 6 + 9;
        result += 2; // incrementing, x++ === x+=1
        double div = 56 / 9; // implicit

        result = result * 9 + 1; // PEMDAS order
        System.out.println(result);
        System.out.println(div);

    }
}
