
package beginnerlevel;

public class String5Buffer {
    public static void main(String[] args) {
        String s1 = "Anisul ";
        StringBuffer sb = new StringBuffer("\n" + s1);
        System.out.println(sb);
        sb.append("Islam ");
        sb.append("25");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setLength(7);
        System.out.println(sb + "\n\n");
    }
}
