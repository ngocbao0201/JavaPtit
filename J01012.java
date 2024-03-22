import java.util.*;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            long n;
            n = sc.nextLong();
            int dem = 0;
            double m = Math.sqrt(n);
            for (long i = 1; i <= m; i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        dem++;
                    }
                    if (i != n / i && (n / i) % 2 == 0)
                        dem++;
                }
            }
            System.out.println(dem);
        }
        sc.close();
    }
}
