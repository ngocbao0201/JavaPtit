import java.util.*;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i == 0)
                    b[i] = a[i];
                else {
                    b[i] = b[i - 1] + a[i];
                }
            }
            int ans = -1;
            for (int i = 1; i < n - 1; i++) {

                if (b[i - 1] == b[n - 1] - b[i]) {
                    ans = i + 1;
                    break;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
