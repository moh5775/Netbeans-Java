
//Primitive datatype to string
//String to Primitive datatype
package beginnerlevel;

public class WrapperClass2 {

    public static void main(String[] args) {
        // integer k string e conversion
        int i = 100;
        String s1 = Integer.toString(i);
        System.out.println("\n\ns1: " + s1);
        // double k string e conversion
        double j = 100;
        String s2 = Double.toString(j);
        System.out.println("s2: " + s2);
        // boolean k string e conversion
        boolean k = true;
        String s3 = Boolean.toString(k);
        System.out.println("s3: " + s3);

        // string k integer e conversion
        String s4 = "32";
        int l = Integer.parseInt(s4);
        System.out.println("l: " + l);
        // string k integer e conversion
        String s5 = "32";
        int m = Integer.valueOf(s5);
        System.out.println("m: " + m);
        // string k double e conversion
        String s6 = "32";
        double n = Double.parseDouble(s6);
        System.out.println("n: " + n + "\n\n");
    }
}
