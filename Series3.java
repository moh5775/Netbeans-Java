
// 1.5 + 2.5 + 3.5 + 4.5 + 5.5 +.....+ (n+0.5)
package beginnerlevel;

import java.util.Scanner;

public class Series3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, i, sum = 0;

        System.out.print("\n\nn: ");
        n = input.nextDouble();
        System.out.println("1st " + n + " digits are:");
        for (i = 1.5; i <= n + 0.5; i = i + 1.0) {
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("Summation of 1st " + n + " digits: " + sum + "\n\n");
    }
}
