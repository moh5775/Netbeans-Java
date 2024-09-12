
package beginnerlevel;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nDo You Love Java ?");
        System.out.printf("Y/y/N/n: ");
        char ch = input.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("Lover\n\n");
        } else if (ch == 'n' || ch == 'N') {
            System.out.println("Not Lover\n\n");
        }
    }
}
