
//Ascending Order

package beginnerlevel;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int[] a = new int[n];
        System.out.print("Before Sorting: ");
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("After Sorting: ");

        /*
         * int temp, j;
         * for (i = 0; i < n; i++) {
         * for (j = i + 1; j < n; j++) {
         * if (a[i] > a[j]) {
         * temp = a[i];
         * a[i] = a[j];
         * a[j] = temp;
         * }
         * }
         * }
         * for (i = 0; i < n; i++) {
         * System.out.print(a[i] + " ");
         * }
         */

        // Or,

        Arrays.sort(a);
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\n");
    }

}
