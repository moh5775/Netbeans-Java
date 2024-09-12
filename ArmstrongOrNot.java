
package beginnerlevel;

import static java.lang.Math.pow;
import java.util.Scanner;

public class ArmstrongOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("\n\nnum: ");
        num = input.nextInt();
        int x = num;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        int n = num;
        int rem, sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum = (int) (sum + pow(rem, count));
            n = n / 10;
        }

        System.out.println("Summation: " + sum);
        if (sum == num) {
            System.out.println(num + " is an armstrong number.\n\n");
        } else {
            System.out.println("Not Armstrong.\n\n");
        }
    }
}
