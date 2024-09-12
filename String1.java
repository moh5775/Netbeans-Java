package beginnerlevel;

public class String1 {

    public static void main(String[] args) {
        String s1 = "mohua akter";
        String s2 = new String("Mohua Akter");
        System.out.println("Process 1: " + s1);
        System.out.println("Process 2: " + s2);
        char[] s3 = {'M', 'o', 'h', 'u', 'a', ' ', 'A', 'k', 't', 'e', 'r'};
        System.out.print("Process 3: ");
        System.out.println(s3);
        char[] s4 = {'M', 'o', 'h', 'u', 'a', ' ', 'A', 'k', 't', 'e', 'r'};
        String s4String = new String(s4);
        System.out.println("Process 4: " + s4String);
        int length1 = s1.length();
        int length2 = s2.length();
        int length3 = s3.length;
        int length4 = s4.length;
        System.out.println("Length of string 1: " + length1);
        System.out.println("Length of string 2: " + length2);
        System.out.println("Length of string 3: " + length3);
        System.out.println("Length of string 4: " + length4);

        boolean isEqual = s1.equals(s2);
        System.out.println("s1 and s2 is equal: " + isEqual);
        boolean isEqual2 = s1.contains(s2);
        System.out.println("s1 and s2 is equal: " + isEqual2);
        boolean isEqual3 = s1.equalsIgnoreCase(s2);
        System.out.println("s1 and s2 is equal: " + isEqual3);
        boolean isEqual4 = s1.equalsIgnoreCase(s4String);
        System.out.println("s1 and s4 is equal: " + isEqual3);
        boolean isEqual5 = s1.equals(s4String);
        System.out.println("s1 and s4 is equal: " + isEqual5);
        boolean isEmpty = s1.isEmpty();
        System.out.println("s1 is empty: " + isEmpty);
    }
}
