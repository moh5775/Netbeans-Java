
package beginnerlevel;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> CountryName = new LinkedList<String>();
        System.out.println("\n\n\n");
        CountryName.add("Bangladesh");
        CountryName.add("Pakistan");
        CountryName.add("Nepal");
        CountryName.add(3, "Srilanka");
        CountryName.addFirst("Argentina");
        CountryName.addLast("Brazil");
        System.out.println("Process 1: ");
        System.out.println(CountryName + "\n");
        System.out.print("Size of the list: " + CountryName.size() + "\n\n");
        System.out.println("Process 2: ");
        for (String Country : CountryName) {
            System.out.println(Country);
        }
        CountryName.remove(5);
        CountryName.remove("Nepal");
        CountryName.removeFirst();

        System.out.println("\nAfter Removing: ");

        System.out.println(CountryName + "\n");
        System.out.println("First Element: " + CountryName.getFirst() + "\n\n");

    }
}
