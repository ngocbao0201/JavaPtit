import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0 && n > 1) {
                        n = n / i;
                    }
                }
            }
            System.out.println(n);
        }
        sc.close();
    }
}
