
package beginnerlevel;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.print("\n\nrow: ");
        row = input.nextInt();
        int i, j;
        System.out.println("\n");
        for (i = row; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

}
