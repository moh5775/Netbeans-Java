
package beginnerlevel;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        number1.add(10);
        number1.add(0);
        number1.add(-5);
        number1.add(9);
        number1.add(4);
        number1.add(30);
        System.out.println("\n\nBefore sorting of number1: " + number1);
        Collections.sort(number1);
        System.out.println("Ascending order of number1: " + number1);

        number2.add(4);
        number2.add(0);
        number2.add(-1);
        number2.add(2);
        number2.add(5);
        number2.add(7);
        System.out.println("\nBefore sorting of number2: " + number2);
        Collections.sort(number2, Collections.reverseOrder());
        System.out.println("Descending order of number2: " + number2 + "\n\n");

    }
}
