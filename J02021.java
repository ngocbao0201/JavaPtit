import java.util.*;

public class J02021 {
    static boolean check(int[] a, int k, int n) {
        for (int i = 1; i <= k; i++) {
            if (a[i] != n - k + i)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k + 1];
        int cnt = 1;
        int j = 0;
        for (int i = 1; i <= k; i++)
            a[i] = i;
        for (int i = 1; i <= k; i++)
            System.out.print(a[i]);
        System.out.print(" ");
        while (!check(a, k, n)) {
            for (int i = k; i >= 1; i--) {
                if (a[i] != n - k + i) {
                    j = i;
                    break;
                }
            }
            a[j]++;
            for (int i = j + 1; i <= k; i++) {
                a[i] = a[j] + i - j;
            }
            for (int i = 1; i <= k; i++)
                System.out.print(a[i]);
            cnt++;
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close();
    }
}
