import java.util.*;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            double a = Math.sqrt(n);
            if ((long) a * (long) a == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
