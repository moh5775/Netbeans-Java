
//1 + 3 + 5  + 7 + 9 +....+ (2*n-1)
package beginnerlevel;

import java.util.Scanner;

public class Series1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, sum = 0;

        System.out.print("\n\nn: ");
        n = input.nextInt();
        System.out.println("1st " + n + " digits are:");
        for (i = 1; i <= (2 * n - 1); i = i + 2) {
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("Summation of 1st " + n + " digits: " + sum + "\n\n");
    }
}
