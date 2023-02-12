import java.util.Scanner;

public class Day6Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        char[] s = myString.toCharArray();

        for(int i = 0; i < myString.length(); i++){
            // Print each sequential character on the same line
            System.out.print(s[i]);
        }
     // Print a newline
        System.out.println();
    }
}
