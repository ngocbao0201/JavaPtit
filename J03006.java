import java.util.*;

public class J03006 {
    static boolean solve(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] != '0' && a[i] != '2' && a[i] != '4' && a[i] != '6' && a[i] != '8')
                return false;
            if (a[i] != a[s.length() - 1 - i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s;
            s = sc.nextLine();
            if (solve(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
