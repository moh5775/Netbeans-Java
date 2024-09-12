
package beginnerlevel;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.print("\n\nrow: ");
        row = input.nextInt();
        int i, j;
        System.out.println("\n\n");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
