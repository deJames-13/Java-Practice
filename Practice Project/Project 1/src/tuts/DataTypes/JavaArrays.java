package tuts.DataTypes;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 5, 6, 71, 2, 3, 4, 5 };
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Multi-dim arrays
        // int[][] matrix = new int[2][3];
        int[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        // to access the array
        // matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));
    }
}
