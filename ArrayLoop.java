
package beginnerlevel;

import java.util.Scanner;

public class ArrayLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        input.nextLine();
        String[] a = new String[n];
        for (i = 0; i < n; i++) {
            System.out.print("string " + (i + 1) + ": ");
            a[i] = input.nextLine();
        }
        System.out.println("\n");
        System.out.println("Output:\n");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n\n");
    }
}
