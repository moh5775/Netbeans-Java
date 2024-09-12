
package beginnerlevel;

public class Assignment19 {
    double length, depth, width;

    Assignment19(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;
    }

    void showResult() {
        double volume = length * depth * width;
        System.out.println("\nVolume: " + volume);
    }
}
