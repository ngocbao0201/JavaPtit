import java.util.*;

public class J01021 {
    static int mod = (int) (1e9 + 7);
    static long poww(long a, long b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = 0,b = 0;
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if( a==0 && b==0) break;
            System.out.println(poww(a,b));
        }
        sc.close();
    }
}
