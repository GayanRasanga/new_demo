import java.util.Scanner;

public class Day6Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String[] s = new String[n];
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0 ; i < n ; i++){
            s[i]= new String();
            s[i] = sc1.nextLine();
        }
        for(int i = 0 ; i < n ; i++){
            int l = s[i].length();
            for(int j = 0 ; j < l ; j++){
                System.out.print(s[i].charAt(j));
                j++;
            }
            System.out.print(" ");
            for(int j = 1 ; j < l ; j++){
                System.out.print(s[i].charAt(j));
                j++;
            }
            System.out.println();
        }
    }
}
