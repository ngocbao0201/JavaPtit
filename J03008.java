import java.util.*;

public class J03008 {
    static boolean solve(String s) {
        // char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7')
                return false;
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (solve(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
