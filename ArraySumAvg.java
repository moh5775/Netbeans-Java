
package beginnerlevel;

import java.util.Scanner;

public class ArraySumAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, sum = 0;
        System.out.print("\n\nn: ");
        n = input.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum = sum + a[i];
        }
        double avg;
        avg = (double) sum / n;
        System.out.println("Summation of Array Elements: " + sum + "\n");
        System.out.println("Average of array elements: " + avg + "\n");
    }
}
