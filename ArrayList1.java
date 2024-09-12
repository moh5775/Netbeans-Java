package beginnerlevel;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("\n\nSize: " + number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 50);
        System.out.println("Array Listing Proccess 1: " + number);
        System.out.print("Array Listing Proccess 2: ");
        for (int x : number) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Array Listing Proccess 3: ");
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
        System.out.println("Size: " + number.size());
        // Removing Elements
        number.remove(2);
        System.out.println("After Removing element of position 2: " + number);
        number.add(2, 9);
        System.out.println("After Adding 9 at position 2: " + number);
        number.add(2, 5);
        System.out.println("After Adding 5 at position 2: " + number);
        System.out.println("Size: " + number.size());
        number.removeAll(number);
        System.out.println("After Removing All Elements: "+number);
        number.clear();
        System.out.println("After Removing All Elements (Another Process): "+number);
    }
}
