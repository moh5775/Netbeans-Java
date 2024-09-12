
package beginnerlevel;

import java.util.Scanner;

public class Assignment18Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] a = new String[7];
        int i;
        System.out.println("\n\nName of week days: ");
        for (i = 0; i < 7; i++) {
            a[i] = input.nextLine();
        }
        int n;
        System.out.println("\n");
        System.out.print("Day number you want to print: ");
        n = input.nextInt();
        for (i = 0; i < 7; i++) {
            if (i == n) {
                System.out.println("Desired day: " + a[i]);
            }
        }
        System.out.println("\n\n");
    }
}
