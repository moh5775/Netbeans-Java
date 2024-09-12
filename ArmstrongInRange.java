
package beginnerlevel;

import static java.lang.Math.pow;
import java.util.Scanner;

public class ArmstrongInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, i, total = 0;
        System.out.print("\n\nstart from: ");
        start = input.nextInt();
        System.out.print("end at: ");
        end = input.nextInt();
        for (i = start; i <= end; i++) {

            int x = i;
            int count = 0;
            while (x != 0) {
                x = x / 10;
                count++;
            }
            int n = i;
            int rem, sum = 0;
            while (n != 0) {
                rem = n % 10;
                sum = (int) (sum + pow(rem, count));
                n = n / 10;
            }

            System.out.println("Summation of " + i + " : " + sum);
            if (sum == i) {
                System.out.println(i + " is an armstrong number.");
                total++;
            }
        }
        System.out.println("Total Armstrong number in " + start + " and " + end + " : " + total + "\n\n");
    }
}
