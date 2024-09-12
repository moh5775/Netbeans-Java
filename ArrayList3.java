
package beginnerlevel;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("\n\nNumber 1: " + number1);
        number2.add(2);
        number2.add(3);
        number2.add(6);
        number2.add(8);
        System.out.println("Number 2: " + number2);
        number3.addAll(number1);
        number3.addAll(number2);
        System.out.println("Number 3:" + number3);
        boolean isEqual = number1.equals(number2);
        System.out.println("\nElements of Number 1 and Number 2 are same: " + isEqual + "\n\n");
    }
}
