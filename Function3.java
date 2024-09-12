
package beginnerlevel;

import java.util.Scanner;

public class Function3 {
    double length, depth, width;

    Function3(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;
    }

    void showResult() {
        double volume = length * depth * width;
        System.out.println("\nVolume: " + volume);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length 1: ");
        double length1 = input.nextInt();
        System.out.print("Width 1: ");
        double width1 = input.nextInt();
        System.out.print("Depth 1: ");
        double depth1 = input.nextInt();
        System.out.print("Length 2: ");
        double length2 = input.nextInt();
        System.out.print("Width 2: ");
        double width2 = input.nextInt();
        System.out.print("Depth 2: ");
        double depth2 = input.nextInt();

        Function3 box1 = new Function3(length1, width1, depth1);
        Function3 box2 = new Function3(length2, width2, depth2);
        box1.showResult();
        box2.showResult();
    }
}
