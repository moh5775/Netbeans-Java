
package beginnerlevel;

public class StringPalindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        System.out.print("\n\nMain String: " + s1 + "\n");
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        System.out.print("Reversed String: " + s2 + "\n");
        if (s1.equals(s2))
            System.out.println("Palindrome\n\n");
        else
            System.out.println("Not a Palindrome\n\n");

    }
}
