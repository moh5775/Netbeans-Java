
package beginnerlevel;

public class String3 {

    public static void main(String[] args) {
        String s1 = "  Bangladesh    is my   country   ";
        System.out.println("\n\nString: " + s1);
        char ch = s1.charAt(7);
        System.out.println("Character at 7 index: " + ch);
        int value = s1.codePointAt(0);
        System.out.println("Ascii Value of 0 indexed character: " + value);
        int firstIndex = s1.indexOf('B');
        System.out.println("First occurance of 'B' is at index: " + firstIndex);

        int lastIndex = s1.lastIndexOf('n');
        System.out.println("Last occurance of 'n' is at index: " + lastIndex);
        String s2 = s1.trim();
        System.out.println("After trimming head and trail space of s1: " + s2 + "\n\n");
    }
}
