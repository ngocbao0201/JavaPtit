import java.util.*;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t + 1];
        for (int i = 1; i <= t; i++)
            a[i] = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            boolean ok = true;
            for (int j = i + 1; j <= t; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    ok = false;
                }
            }
            if (!ok) {
                System.out.print("Buoc " + i + ": ");
                for (int j = 1; j <= t; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
