import java.util.*;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j <= n; j++) {
                if (a[idx] > a[j])
                    idx = j;
            }
            if (idx != i) {
                int tmp = a[idx];
                a[idx] = a[i];
                a[i] = tmp;
            }
            System.out.print("Buoc " + i + ": ");
            for (int j = 1; j <= n; j++)
                System.out.print(a[j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
