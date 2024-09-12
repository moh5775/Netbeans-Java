
package beginnerlevel;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.printf("\n\nCh: ");
        ch = input.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel\n\n");
        } else {
            System.out.println("Consonant\n\n");
        }
    }
}
