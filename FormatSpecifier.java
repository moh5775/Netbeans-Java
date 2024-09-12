
package beginnerlevel;

public class FormatSpecifier {

    public static void main(String[] args) {

        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 126;
        float f = 10.2f;
        double d = 10.2;
        System.out.printf("\n\nb = %b\n", b);
        System.out.printf("c = %c\n", c);
        System.out.printf("s = %d\n", s);
        System.out.printf("i = %d\n", i);
        System.out.printf("f = %.2f\n", f);
        System.out.printf("d = %.3f\n\n", d);
    }
}
