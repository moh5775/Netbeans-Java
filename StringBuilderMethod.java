






package beginnerlevel;

public class StringBuilderMethod {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Anisul");
        str.append(" Islam");
        str.append(" 25");
        System.out.println("\n\nString: " + str);
        str.reverse();
        System.out.println("Reversed String: " + str);
        str.delete(1, 5);
        System.out.println("After Deletion: " + str + "\n\n");
    }
}







