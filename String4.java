package beginnerlevel;

public class String4 {

    public static void main(String[] args) {
        String s1 = "It is an international institute";
        System.out.println("\n\nString: " + s1);
        String s2 = s1.replace('i', 'j');
        System.out.println("\nAfter replacing 'i' by 'j': " + s2);

        String[] s3 = s1.split(" ");
        System.out.println("\nAfter Splitting s1 depending on space:");
        for (String x : s3) {
            System.out.println(x);
        }
        String s4 = "It_is_an_international institute";
        String[] s5 = s4.split("_");
        System.out.println("\nAfter Splitting s4 depending on underscore:");
        for (String y : s5) {
            System.out.println(y);
        }
        String s6 = "01710-246292";
        String[] s7 = s6.split("-");
        System.out.println("\nAfter Splitting s6 depending on hyphen:");
        for (String z : s7) {
            System.out.println(z);
        }
        System.out.println("\n\n");
    }
}
