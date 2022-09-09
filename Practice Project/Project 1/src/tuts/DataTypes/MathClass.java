package tuts.DataTypes;

public class MathClass {
    public static void main(String[] args) {
        /*
         * METHODS
         * Math.round(float/double)
         * Math.ceil(double)
         * Math.floor(double)
         * Math.max(1, 2)
         * Math.min(1, 2)
         * Math.random() returns a double
         * Math.random()*100 returns a double between 0-100
         * (int) (Math.random()*100) returns integer
         * 
         * 
         */
        int result = (int) (Math.random() * 100);
        System.out.println(result);
    }
}
