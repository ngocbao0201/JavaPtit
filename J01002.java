import java.util.*;

public class J01002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t>0){
            long n;
            n = sc.nextInt();
            System.out.println( n*(n+1)/2 );
            t--;
    }
    sc.close();
}
}
