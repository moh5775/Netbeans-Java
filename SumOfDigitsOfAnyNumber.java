
package beginnerlevel;

import java.util.Scanner;

public class SumOfDigitsOfAnyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int rem, sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Summation of digits: " + sum + "\n\n");
    }
}
