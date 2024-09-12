
package beginnerlevel;

import java.util.Scanner;

public class ReverseAnInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int rem, rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse of the integer: " + rev + "\n\n");
    }
}
