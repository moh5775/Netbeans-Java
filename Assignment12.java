
//sum of odd numbers

package beginnerlevel;

import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, sum = 0;
        System.out.printf("\n\nnum: ");
        num = input.nextInt();
        for (i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Summation of odd numbers from 1 to " + num + " is " + sum);
    }
}
