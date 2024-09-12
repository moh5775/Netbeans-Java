
package beginnerlevel;

import java.util.Scanner;

public class CallByValue {
    String name;

    void change(String r2) {
        r2 = "Mithi";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CallByValue r1 = new CallByValue();
        System.out.print("Enter Name: ");
        r1.name = input.nextLine();
        System.out.println("Before Changing: " + r1.name);
        r1.change(r1.name);
        System.out.println("After changing: " + r1.name);
    }
}
