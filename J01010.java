import java.util.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean check = true;
            String a;
            a = sc.next();
            char[] s = a.toCharArray();

            for (int i = 0; i < a.length(); i++) {
                if (s[i] == '0' || s[i] == '1' || s[i] == '8' || s[i] == '9') {
                    if (s[i] == '8' || s[i] == '9')
                        s[i] = '0';
                } else {
                    check = false;
                    break;
                }
            }

            if (check == false)
                System.out.println("INVALID");
            else {
                int dem = 0;
                String b = "";
                for (int i = 0; i < a.length(); i++) {
                    b = b + s[i];
                    if (s[i] == '0')
                        dem++;
                }
                if (dem == a.length())
                    System.out.println("INVALID");
                else {
                    long n = Long.parseLong(b);
                    System.out.println(n);
                }
            }

        }
        sc.close();
    }
}
