
package beginnerlevel;

import java.util.Scanner;

public class VariableLengthArgument {

    void add(int... num) {
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Summation: " + sum);
    }

    void cull(double... num) {
        double sum = 0;
        for (double x : num) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        VariableLengthArgument ob = new VariableLengthArgument();
        ob.add(10, 20);
        ob.add(10, 20, 30, 40);
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("n: ");
        n = input.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = input.nextInt();
        }
        ob.add(arr);
        double x, y, z;
        System.out.print("x: ");
        x = input.nextDouble();
        System.out.print("y: ");
        y = input.nextDouble();
        System.out.print("z: ");
        z = input.nextDouble();
        ob.cull(x, y, z);
    }
}
