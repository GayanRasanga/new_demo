import java.util.Scanner;

public class Day6Loops3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        for(int i = 0; i < n; i++){
            char[] inputString = sca.next().toCharArray();
            for(int j = 0; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.print(" ");
            for(int j = 1; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        sca.close();
    }
}
