
package beginnerlevel;

import java.util.Scanner;

public class Assignment10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, i;
        System.out.print("\n\na: ");
        a = input.nextInt();
        for (i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}
