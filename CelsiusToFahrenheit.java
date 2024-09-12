
package beginnerlevel;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F;
        System.out.printf("\n\nCelsius temperature: ");
        C = input.nextDouble();
        F = (C * 9) / 5 + 32;
        System.out.println("Fahterheit Temperature: " + F + "\n\n");
    }
}
