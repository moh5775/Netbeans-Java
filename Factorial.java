
package beginnerlevel;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, fact = 1;
        System.out.print("n: ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + ": " + fact);
    }
}
