
package beginnerlevel;

import java.util.Scanner;

public class FibonacchiOfNthPosition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(a[n - 1] + "\n\n");
    }
}
