
package beginnerlevel;

import java.util.Scanner;

public class MathClass1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, max, min;
        System.out.printf("\n\na: ");
        a = input.nextInt();
        System.out.printf("b: ");
        b = input.nextInt();
        max = Math.max(a, b);
        min = Math.min(a, b);
        double power = Math.pow(a, b);
        System.out.printf("Maximum: %d\nMinimum: %d\nPower: %f\n", max, min, power);

        int nearly_integer_value = Math.round(2.5f);
        System.out.println("Nearly integer Value: " + nearly_integer_value);

        System.out.println("Value of PI: " + Math.PI + "\n\n");
    }
}
