
//factorial

package beginnerlevel;

import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i;
        int fact = 1;
        System.out.printf("\n\nnum: ");
        num = input.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact + "\n\n");
    }
}
