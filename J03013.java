import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            BigInteger x = new BigInteger(sc.next());
            BigInteger y = new BigInteger(sc.next());
            BigInteger z = x.subtract(y).abs();
            String s = String.valueOf(z);
            int l = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
            while (s.length() < l)
                s = "0" + s;
            System.out.println(s);
        }
        sc.close();
    }
}
