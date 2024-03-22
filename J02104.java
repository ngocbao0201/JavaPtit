import java.util.*;

public class J02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t + 1][t + 1];
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                if (a[i][j] == 1) {
                    System.out.println("(" + i + "," + j + ")");
                    a[i][j] = a[j][i] = 0;
                }
            }
        }
        sc.close();
    }
}
