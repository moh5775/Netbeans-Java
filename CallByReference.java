
package beginnerlevel;

import java.util.Scanner;

public class CallByReference {

    String name;

    void change(CallByReference r2) {
        r2.name = "Mithi";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CallByReference r1 = new CallByReference();
        System.out.print("Enter Name: ");
        r1.name = input.nextLine();
        System.out.println("Before Changing: " + r1.name);
        r1.change(r1);
        System.out.println("After changing: " + r1.name);
    }
}
