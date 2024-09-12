
package beginnerlevel;

public class Constructor1 {
    String name, gender;
    int phone;

    Constructor1(String m, String n, int p) {
        name = m;
        gender = n;
        phone = p;
    }

    void output() {
        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }
}
