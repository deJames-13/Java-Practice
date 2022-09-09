package tuts.DataTypes;

public class StringMethods {
    public static void main(String[] args) {
        // '\' - backlash is used as an Escape sequence
        // \\ to print backlash
        // \n to print a new line
        // \t for tab
        // more at docs

        String str = "\"This is a string!\"";
        boolean ends = str.endsWith("!");
        int len = str.length();
        String concat = str + "\n";
        int index = str.indexOf("a");
        String replace = str.replace("!", "lol");
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        String trim = str.trim();

        System.out.println(str);
        System.out.println(ends);
        System.out.println(len);
        System.out.println(concat);
        System.out.println(replace);
        System.out.println(index);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(trim);

    }
}
