package beginnerlevel;

import java.util.Stack;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Stack samplestack = new Stack<>();
        samplestack.push(new Integer(56));
        samplestack.push(new Integer(48));
        samplestack.push(new Integer(79));
        for (Object obj : samplestack) {

            System.out.print(obj + " ");
        }

    }
}
