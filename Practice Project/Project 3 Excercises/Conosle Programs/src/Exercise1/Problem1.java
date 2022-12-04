package Exercise1;

import java.util.Scanner;

public class Problem1 {
    public static final int ROW = 5;
    public static final int COL = 7;

    public static void main(String[] args) {
        double gradeWeight = 0;
        Scanner scanner = new Scanner(System.in);
        int table[][] = new int[ROW][COL];
        String colTitle[] = { "Student #", "Grade #1", "Grade #2", "Grade #3", "Grade #4", "Average #1", "Average #2" };

        for (int i = 0; i < ROW; i++) {
            table[i][0] = i + 1;
            System.out.format("Enter grades for Student #%d%n", i + 1);
            for (int j = 1; j < COL - 2; j++) {
                System.out.format("Grade #%d: ", j);
                table[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < ROW; i++) {
            for (int j = 1; j < COL - 2; j++) {
                table[i][5] += table[i][j];
                switch (j) {
                    case 1:
                        gradeWeight = 0.2;
                        break;
                    case 2:
                        gradeWeight = 0.3;
                        break;
                    case 3:
                        gradeWeight = 0.3;
                        break;
                    case 4:
                        gradeWeight = 0.2;
                        break;

                    default:
                        break;
                }
                table[i][6] += (table[i][j] * gradeWeight);
            }
            table[i][5] /= 4;
        }
        System.out.println("\nOUTPUT\n");
        for (String string : colTitle) {
            System.out.format("%-15s", string);
        }
        System.out.println();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.format("%-15d", table[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
