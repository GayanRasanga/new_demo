import java.util.HashMap;
import java.util.Scanner;

public class Day8hasmap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap hash = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hash.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (hash.containsKey(s)) {
                System.out.println(s + "="+hash.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
