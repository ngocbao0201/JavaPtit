import java.util.*;

public class J01006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        long fibo[] = new long[95];
        fibo[0]=0;
        fibo[1]=1;
        for( int i=2;i<93;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        while(t-- >0){
            int n;
            n = sc.nextInt();
            System.out.println(fibo[n]);
        }
        sc.close();
    }
}
