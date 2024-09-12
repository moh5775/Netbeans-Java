
package beginnerlevel;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.print("\n\nrow: ");
        row = input.nextInt();
        int i, j;
        System.out.println("\n");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
