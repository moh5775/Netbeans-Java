
package beginnerlevel;

import java.util.Scanner;

public class UnaryOperator {

    public static void main(String[] args) {
        int x, result;
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\nx: ");
        x = input.nextInt();
        result = +x;
        System.out.println("Applying Unary Plus: " + result);
        result = -x;
        System.out.println("Applying Unary Minus: " + result + "\n\n");
    }
}
