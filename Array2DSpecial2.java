



package beginnerlevel;

import java.util.Scanner;

public class Array2DSpecial2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("\n\nRow: ");
        row = input.nextInt();
        col = row;
        int[][] a = new int[row][col];
        System.out.println("\nOutput:\n");
        int pos = 1;

        for (i = 0; i < row; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(pos + " ");
                pos++;
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}















