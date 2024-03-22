import java.util.*;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int j = 0; j < n; j++) {
            boolean ok = false;
            for (int i = 0; i < n - j - 1; i++) {
                if (a[i + 1] < a[i]) {
                    int tmp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = tmp;
                    ok = true;
                }
            }
            if (!ok)
                break;
            System.out.print("Buoc " + (j + 1) + ": ");
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();

        }
        sc.close();
    }
}
