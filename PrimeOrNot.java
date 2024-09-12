
package beginnerlevel;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int count = 0;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime\n\n");
        } else {
            System.out.println("Not Prime\n\n");
        }
    }
}
