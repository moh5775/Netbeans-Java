
package beginnerlevel;

import java.util.Scanner;

public class BitwiseOperator1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.printf("\n\nnum1: ");
        num1 = input.nextInt();
        System.out.printf("num2: ");
        num2 = input.nextInt();
        large = (num1 > num2) ? num1 : num2;
        System.out.println("maximum value: " + large + "\n\n");
    }
}
