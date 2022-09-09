package tuts.DataTypes;

import java.util.Random;

public class Randomize {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(12) + 1;
        double y = random.nextInt(5) + 1;
        System.out.println(x + "\n" + y);
    }

}
