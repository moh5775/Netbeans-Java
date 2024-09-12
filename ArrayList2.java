
package beginnerlevel;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("\n\nSize: " + number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 50);
        System.out.println("Array List: " + number);
        boolean check = number.isEmpty();
        System.out.println("Array List is empty: " + check);
        boolean isContain = number.contains(30);
        System.out.println("30 is in Array List: " + isContain);
        int index = number.indexOf(30);
        System.out.println("Index of 30: " + index);
        number.set(2, 90);
        System.out.println("\nAfter replacing index 2 by 90: " + number);
        int x = number.get(1);
        System.out.println("Element of index 1: " + x);
        number.clear();
        System.out.println("After removing elements: " + number);
        boolean check2 = number.isEmpty();
        System.out.println("Array List is empty: " + check2);
        boolean isContain2 = number.contains(30);
        System.out.println("30 is in Array List: " + isContain2);
        int index2 = number.indexOf(30);
        System.out.println("Index of 30: " + index2 + "\n\n");
    }
}
