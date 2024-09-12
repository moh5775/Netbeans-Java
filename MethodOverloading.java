
package beginnerlevel;

import java.util.Scanner;

public class MethodOverloading {
    void add() {
        System.out.println("Nothing to print");
    }

    void add(int x, int y) {
        double sum = x + y;
        System.out.println("Summation: " + sum);
    }
    void add(double x, double y) {
        double sum = x + y;
        System.out.println("Summation: " + sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double x, y;
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("x: ");
        x = input.nextDouble();
        System.out.print("y: ");
        y = input.nextDouble();
        MethodOverloading ob = new MethodOverloading();
        ob.add();
        ob.add(a, b);
        ob.add(x, y);
    }
}
