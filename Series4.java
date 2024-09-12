
//1^2 + 2^2 + 3^2 + 4^2 + ..... + n^2
package beginnerlevel;

import java.util.Scanner;

public class Series4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, sum = 0;

        System.out.print("\n\nn: ");
        n = input.nextInt();
        System.out.println("1st " + n + " digits are:");
        for (i = 1; i <= n; i++) {
            System.out.println(i * i);
            sum = sum + i * i;
        }
        System.out.println("Summation of 1st " + n + " digits: " + sum + "\n\n");
    }
}
