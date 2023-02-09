import java.util.*;

public class Initializationblocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(h > 0 && b > 0 ? h*b :"java.lang.Exception: Breadth and height must be positive");
    }
}
