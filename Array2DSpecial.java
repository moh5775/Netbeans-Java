
package beginnerlevel;

import java.util.Scanner;

public class Array2DSpecial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("\n\nRow: ");
        row = input.nextInt();
        System.out.print("Col: ");
        col = input.nextInt();
        int[][] a = new int[row][col];
        int count = 1;
        System.out.println("\n\nOutput:");
        int pos = 1;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(pos + " ");
                pos++;
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
