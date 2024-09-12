
//2 + 4 + 6 + 8 + 10 + ..... + 2*n
package beginnerlevel;

import java.util.Scanner;

public class Series2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, sum = 0;

        System.out.print("\n\nn: ");
        n = input.nextInt();
        System.out.println("1st " + n + " digits are:");
        for (i = 2; i <= 2 * n; i = i + 2) {
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("Summation of 1st " + n + " digits: " + sum + "\n\n");
    }
}
