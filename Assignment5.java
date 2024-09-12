
package beginnerlevel;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\nAge: ");
        age = input.nextInt();
        if (age >= 18) {
            System.out.printf("Eligible for vote\n\n\n");
        } else {
            System.out.println("Not Eligible\n\n");
        }
    }
}
