
package beginnerlevel;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("\n\nRow: ");
        row = input.nextInt();
        System.out.print("Col: ");
        col = input.nextInt();
        int[][] a = new int[row][col];
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.printf("a[%d][%d]: ", i, j);
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("\nOutput:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
