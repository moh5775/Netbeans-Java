
package beginnerlevel;

public class Function2 {
    double length, depth, width;

    Function2(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;
    }

    void showResult() {
        double volume = length * depth * width;
        System.out.println("\nVolume: " + volume);
    }

    public static void main(String[] args) {
        Function2 box1 = new Function2(10, 9, 3);
        Assignment19 box2 = new Assignment19(30, 14, 10);
        box1.showResult();
        box2.showResult();
    }
}
