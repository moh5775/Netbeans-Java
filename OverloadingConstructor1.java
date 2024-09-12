
package beginnerlevel;

public class OverloadingConstructor1 {
    String name, gender;
    int phone;

    OverloadingConstructor1() {
        System.out.println("No Information");
    }

    OverloadingConstructor1(String m, String n) {
        name = m;
        gender = n;
    }

    OverloadingConstructor1(String m, String n, int p) {
        name = m;
        gender = n;
        phone = p;
    }

    void output() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.print("\n\n");
    }

}
