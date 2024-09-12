
package beginnerlevel;

import java.util.Scanner;

public class Array2DiagonalUpperLowerTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("\n\nRow: ");
        row = input.nextInt();

        col = row;
        int[][] a = new int[row][col];
        int sum = 0;
        System.out.println("\nElements of matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = input.nextInt();
                if (i == j) {
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println("\nSum of main diagonal: " + sum);
        int sum1 = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (j > i) {
                    sum1 = sum1 + a[i][j];
                }
            }
        }
        System.out.println("\nSum of upper triangle: " + sum1);

        int sum2 = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i > j) {
                    sum2 = sum2 + a[i][j];
                }
            }
        }
        System.out.println("\nSum of lower triangle: " + sum2 + "\n\n");
    }
}
