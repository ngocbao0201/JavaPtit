import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] a1 = new int[1005];
        int[] b1 = new int[1005];
        for (int i = 1; i <= 1000; i++) {
            a1[i] = b1[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            a1[a[i]] = 1;
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            b1[b[i]] = 1;
        }
        for (int i = 1; i <= 1000; i++) {
            if (a1[i] == 1 && b1[i] == 1)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
