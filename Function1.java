
package beginnerlevel;

public class Function1 {
    static int id;
    static String name;
    static {
        id = 101;
        name = "Anisul Islam";
    }

    static void display() {
        System.out.println("\n\nid: " + id);
        System.out.println("Name: " + name + "\n\n");
    }

    public static void main(String[] args) {
        StaticBlock1.display();
    }
}
