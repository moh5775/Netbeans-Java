
package beginnerlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sting to reverse: ");
        String s1 = br.readLine();
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println("Reversed String: " + s2);
    }
}
