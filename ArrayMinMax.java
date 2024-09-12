
package beginnerlevel;

import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Maximum Element: " + max + "\n");
        System.out.println("Minimum Value: " + min + "\n");
    }
}
