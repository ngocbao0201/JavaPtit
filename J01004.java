import java.util.*;

public class J01004 {
    static boolean Songuyento(long a) {
        if (a < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            long n;
            n = sc.nextLong();
            if (Songuyento(n) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
        sc.close();
    }
}
