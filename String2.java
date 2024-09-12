
package beginnerlevel;

public class String2 {
    public static void main(String[] args) {
        String firstName = "Mohua";
        String LastName = " Akter";
        String FullName = firstName + LastName;
        System.out.println("\n\nFull Name Process 1: " + FullName);
        String FullName2 = firstName.concat(LastName);
        System.out.println("Full Name Process 2: " + FullName2);
        String upperName = FullName.toUpperCase();
        System.out.println("\nAfter converting every character in upper case: " + upperName);

        String lowerName = FullName.toLowerCase();
        System.out.println("After converting every character in lower case: " + lowerName);
        boolean check = firstName.startsWith("A");
        System.out.println("\nFirst name is started with \"A\": " + check);
        boolean check2 = firstName.startsWith("Moh");
        System.out.println("First name is started with \"Moh\": " + check2);
        boolean check3 = LastName.endsWith("r");
        System.out.println("Last name is ended with \"r\": " + check3);
        String[] names = { "Esha", "Maha", "Nehan" };
        System.out.print("\nnames process 1: ");
        for (String x : names) {
            System.out.print(x + " ");
        }
        System.out.print("\nnames process 2: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n\n");
    }
}
