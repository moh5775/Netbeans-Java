
package beginnerlevel;

public class WrapperClass1 {

    public static void main(String[] args) {
        int x = 30;// Primitive Data Type
        Integer y = Integer.valueOf(x);// Object e conversion
        System.out.println("\n\ny: " + y);// Object
        Integer z = x; // Autoboxing (Primitive->Object(automatically))
        System.out.println("z: " + z);

        // object -> primitive data type
        Double d = 10.25;// Object
        System.out.println(d);
        double e = d.doubleValue();// Primitive datatype e conversion
        System.out.println("e: " + e);
        double f = d;// Unboxing
        System.out.println("f: " + f + "\n\n");
    }
}
