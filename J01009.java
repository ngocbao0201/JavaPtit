import java.util.*;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            long tich = 1;
            for (long j = 1; j <= i; j++) {
                tich *= j;
            }
            sum += tich;
        }
        System.out.println(sum);
        sc.close();
    }
}
