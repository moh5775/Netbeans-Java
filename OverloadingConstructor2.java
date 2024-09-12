
package beginnerlevel;

public class OverloadingConstructor2 {
    public static void main(String[] args) {
        OverloadingConstructor1 teacher1 = new OverloadingConstructor1();
        teacher1.output();
        OverloadingConstructor1 teacher2 = new OverloadingConstructor1("Anisul Islam", "Male");
        teacher2.output();
        
        OverloadingConstructor1 teacher3 = new OverloadingConstructor1("Arpita Podder", "Female", 1990899810);
        teacher3.output();
    }
}
