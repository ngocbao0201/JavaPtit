import java.util.*;

public class J01018 {
    static boolean solve(String s) {
        int sum = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 2)
                return false;
            sum += (s.charAt(i) - '0');
        }
        if (sum % 10 != 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (solve(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
