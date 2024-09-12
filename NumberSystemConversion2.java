
//Conversion from decimal
package beginnerlevel;

import java.util.Scanner;

public class NumberSystemConversion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("\n\n\nBinary: " + binary);
        int decimal2 = 15;
        String octal = Integer.toOctalString(decimal2);
        System.out.println("Binary: " + octal);
        int decimal3 = 15;
        String hexadeimal = Integer.toHexString(decimal3);
        System.out.println("Binary: " + hexadeimal);
        int dec;
        System.out.print("Enter a decimal number: ");
        dec = input.nextInt();
        String hexadecimal = Integer.toHexString(dec);
        System.out.println("After converting to hexa: " + hexadecimal + "\n\n");
    }
}
