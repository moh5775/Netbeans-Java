
//conversion into decimal
package beginnerlevel;

public class NumberSystemConversion1 {
    public static void main(String[] args) {
        String binary = "1010";
        Integer decimal1 = Integer.parseInt(binary, 2);
        System.out.println("\n\nDecimal value: " + decimal1);
        String octal = "675";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println("Decimal value: " + decimal2);
        String hexadecimal = "A";
        Integer decimal3 = Integer.parseInt(hexadecimal, 16);
        System.out.println("Decimal value: " + decimal3 + "\n\n");

    }
}
