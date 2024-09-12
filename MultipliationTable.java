
package beginnerlevel;

import java.util.Scanner;

public class MultipliationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, i, j;
        System.out.print("\n\nm: ");
        m = input.nextInt();
        System.out.print("n: ");
        n = input.nextInt();
        for (i = m; i <= n; i++) {
            System.out.println("Multiplication Table of " + i + " :");
            for (j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
