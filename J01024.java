import java.util.*;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            boolean ok = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                    ok = true;
                    break;
                }
            }
            if (ok)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
