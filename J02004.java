import java.util.*;

public class J02004 {
    static boolean check(long[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != a[n - 1 - i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n;
            n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            if (check(a, n) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
        sc.close();
    }
}