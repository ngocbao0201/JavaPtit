import java.util.*;

public class J01008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for( int i=1;i<=t;i++){
            long n;
            n = sc.nextLong();
            System.out.print("Test " + i + ": ");
            for( int j=2;j<=Math.sqrt(n);j++){
                int dem=0;
                if( n%j == 0 ){
                    while(n%j==0){
                        dem++;
                        n=n/j;
                    }
                System.out.printf(j + "(" + dem + ") ");
                }
            }
            if(n>1) System.out.printf(n + "(1)");
            System.out.println();
        }
        sc.close();
    }
}
