
//print pallindrome numbers in a range and count them.
package beginnerlevel;

import java.util.Scanner;

public class Assignment14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("\n\nStart from: ");
        m = input.nextInt();
        System.out.print("End at: ");
        n = input.nextInt();
        System.out.println("\n");
        int i, count = 0;
        for (i = m; i <= n; i++) {
            int num = i;
            int rem, rev = 0;
            while (num != 0) {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            System.out.print("Reversed integer of " + i + " : " + rev);
            System.out.printf("\n");
            if (rev == i) {
                System.out.println(i + " is a pallindrome number");
                count++;
            }
        }
        System.out.println("\nTotal Pallindrome Number: " + count + "\n\n");
    }
}
