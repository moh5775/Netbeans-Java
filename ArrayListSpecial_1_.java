package beginnerlevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSpecial_1_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n, i;
        System.out.print("n: ");
        n = input.nextInt();
        input.nextLine();
        for (i = 1; i <= n; i++) {
            System.out.println("Enter elements for array list " + i + " :");
            System.out.println("Type \"exit\" to stop:");
            while (true) {
                String enter = input.nextLine();
                if (enter.equalsIgnoreCase("exit")) {
                    break;
                }
                list.add(enter);
            }
            System.out.print("Array list " + i + " :");
            System.out.println(list);
            Collections.sort(list);
            System.out.println("Ascending order of list " + i + " : " + list);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("Descending order of list " + i + " : " + list);
            list.clear();
        }
        input.close();
    }
}
