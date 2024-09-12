
package beginnerlevel;

public class StaticVariable4 {
    public static void main(String[] args) {
        System.out.println("\n\nName of static variable: " + StaticVariable3.University2);
        StaticVariable3 ob = new StaticVariable3();
        System.out.println("without static variable: " + ob.University1 + "\n\n");
    }
}
