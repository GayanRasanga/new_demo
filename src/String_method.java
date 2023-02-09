import java.util.Scanner;

public class String_method {
    public static void main(String[] args) {
        String s1="javat point";
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1));
       // compareto();
        substring();
    }
    public static void compareto(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.compareTo(B));
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+ " "+ B.substring(0,1).toUpperCase()+B.substring(1));
    }

    public static void  substring() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String sm = s.substring(0,k);
        String lg = s.substring(0,k);
        for(int i = 0; i < s.length()-k+1; i++) {
            String atual = s.substring(i, i+k);
            System.out.println(atual);
            System.out.println(k);
            sm = atual.compareTo(sm) < 0 ? atual : sm;
            lg = atual.compareTo(lg) > 0 ? atual : lg;
        }
        System.out.println( "Syaaa:"+ sm + "\n" + lg);

    }
}

