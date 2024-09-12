
package beginnerlevel;

import java.util.Scanner;

public class RecursionFactorial {

    int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("n: ");
        n = input.nextInt();
        RecursionFactorial ob = new RecursionFactorial();
        int factorial = ob.fact(n);
        System.out.println("Factorial of " + n + ": " + factorial);
    }
}
