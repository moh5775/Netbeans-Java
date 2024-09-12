
package beginnerlevel;

import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, i, j;
        System.out.print("\nm: ");
        m = input.nextInt();
        System.out.print("n: ");
        n = input.nextInt();
        System.out.println("Prime Numbers between " + m + " and " + n + " :");
        int total = 0;
        for (j = m; j <= n; j++) {
            int count = 0;
            if (j == 1) {
                count = 1;
            }
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println(j);
                total++;
            }

        }
        System.out.println("Total Prime Number: " + total + "\n\n");
    }
}
