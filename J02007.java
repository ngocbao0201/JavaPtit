import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[100005];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                ++b[a[j]];
            }
            System.out.println("Test " + i + ":");
            for (int j : a) {
                if (b[j] > 0) {
                    System.out.println(j + " xuat hien " + b[j] + " lan");
                    b[j] = 0;
                }
            }
        }
        sc.close();
    }
}
