

package beginnerlevel;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample1 {
    String name, phone;
    int id;

    LinkedListExample1(String name, int id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }
    public static void main(String[] args) {
        LinkedList<LinkedListExample1> List = new LinkedList<LinkedListExample1>();
        LinkedListExample1 s1 = new LinkedListExample1("Mahia", 101, "01990811210");

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nName: ");
        String name = input.nextLine();
        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Phone: ");
        String phone = input.nextLine();
        LinkedListExample1 s2 = new LinkedListExample1(name, id, phone);
        List.add(s1);
        List.add(s2);
        System.out.println("\n\n");
        for (LinkedListExample1 element : List) {
            System.out.println("Name: " + element.name + "  ID: " + element.id + "  Phone: " + element.phone);
        }
        System.out.println("\n\n");

    }
}













