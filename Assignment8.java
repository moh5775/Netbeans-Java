
package beginnerlevel;

import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1, ch2;
        System.out.printf("\n\nHave you completed masters? y/n/Y/N:  ");
        ch1 = input.next().charAt(0);
        System.out.printf("Are you fluent in English? y/n/Y/N:  ");
        ch2 = input.next().charAt(0);
        if ((ch1 == 'y' || ch1 == 'Y') && (ch2 == 'y' || ch2 == 'Y'))
            System.out.println("Eligible\n\n");
        else
            System.out.println("Not Eligible\n\n");
    }
}
