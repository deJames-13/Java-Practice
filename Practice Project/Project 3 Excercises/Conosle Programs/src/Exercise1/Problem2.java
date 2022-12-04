package Exercise1;

public class Problem2 {
    public static void main(String[] args) {
        int sumLeft = 0;
        int sumRight = 0;
        int l = 3;

        int arr[][] = {
                { 45, 50, 100, 32 },
                { 80, 50, 35, 12 },
                { 150, 300, 75, 90 },
                { 78, 200, 77, 29 },
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sumLeft += arr[i][j];
                }
            }
            sumRight += arr[i][l];
            l--;
        }
        System.out.printf("The sum for the left diagonal is: %d\n", sumLeft);
        System.out.printf("The sum for the right diagonal is: %d\n", sumRight);

    }
}
