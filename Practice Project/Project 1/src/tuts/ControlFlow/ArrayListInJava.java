package tuts.ControlFlow;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        /*
         * ARRAY LIST - changeable array
         */
        ArrayList<Object> myArray = new ArrayList<>();
        myArray.add("lol");
        myArray.add(1);
        // Object[] myArray = { "lol", 1 };
        Object myObject = "lol";
        myObject = 1;
        System.out.println(myArray);
        System.out.println(myObject);

    }
}
