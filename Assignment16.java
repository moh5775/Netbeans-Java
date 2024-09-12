
package beginnerlevel;

import java.util.Scanner;

public class Assignment16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.print("\n\nUsername: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();
        if (username.equals("mohua") && password.equals("1234")) {
            System.out.println("Welcome..!!\n\n");
        } else {
            System.out.println("Invalid Username or Password.\n\n");
        }
    }
}
