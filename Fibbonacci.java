
package beginnerlevel;

import java.util.Scanner;

public class Fibbonacci {

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
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n\n");
    }
}
