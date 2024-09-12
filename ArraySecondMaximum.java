
package beginnerlevel;

import java.util.Scanner;

public class ArraySecondMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max2 = max;
                max = a[i];
            }
            if (a[i] < max && a[i] > max2)
                max2 = a[i];
        }
        System.out.println("max: " + max);
        System.out.println("2nd max: " + max2);
    }
}
