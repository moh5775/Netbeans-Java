
package beginnerlevel;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomnumber= rand.nextInt(3)+1;
        System.out.println("Random Number: "+randomnumber);
    }
}
