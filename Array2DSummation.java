
package beginnerlevel;

import java.util.Scanner;

public class Array2DSummation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("\n\nRow: ");
        row = input.nextInt();
        System.out.print("Col: ");
        col = input.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        System.out.println("\nElements of a:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("\nElements of b:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("\nAfter Summation:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
