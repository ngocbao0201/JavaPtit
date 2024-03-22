import java.util.*;

public class J01011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- >0){
            long a,b,c,d;
            a = sc.nextLong();
            b = sc.nextLong();
            c=a;d=b;
            long tmp;
            while( b!=0 ){
                tmp = a%b;
                a=b;
                b=tmp;
            }
            System.out.println( (c*d)/a + " " + a );
        }
        sc.close();
    }
}
