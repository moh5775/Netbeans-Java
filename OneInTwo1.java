
package beginnerlevel;

import java.util.Scanner;

public class OneInTwo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OneInTwo2 teacher1 = new OneInTwo2();
        System.out.print("\nName 1: ");
        teacher1.name = input.nextLine();
        System.out.print("Gender 1: ");
        teacher1.gender = input.nextLine();
        System.out.print("Phone 1: ");
        teacher1.phone = input.nextLine();
        teacher1.output();

        OneInTwo2 teacher2 = new OneInTwo2();
        System.out.print("Name 2: ");
        teacher2.name = input.nextLine();
        System.out.print("Gender 2: ");
        teacher2.gender = input.nextLine();
        System.out.print("Phone 2: ");
        teacher2.phone = input.nextLine();
        teacher2.output();
    }
}
