import java.util.*;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fibo[] = new long[95];
        fibo[0] = 0;
        fibo[1] = 1;
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            long n;
            n = sc.nextLong();
            if (n == 0)
                System.out.println("YES");
            else {
                for (int i = 2; i < 93; i++) {
                    fibo[i] = fibo[i - 1] + fibo[i - 2];
                    if (fibo[i] == n) {
                        System.out.println("YES");
                        break;
                    } else if (fibo[i] > n) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
