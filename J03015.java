import java.util.*;
import java.math.BigInteger;

public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        BigInteger a = new BigInteger(s);
        s = sc.nextLine();
        BigInteger b = new BigInteger(s);
        System.out.println(a.subtract(b));
        sc.close();
    }
}
