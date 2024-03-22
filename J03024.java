import java.util.Scanner;

public class J03024 {
    static boolean check(String s) {
        char[] a = s.toCharArray();
        for (char i : a) {
            if (i != '0' && i != '1' && i != '2' && i != '3' && i != '4' && i != '5' && i != '6' && i != '7' && i != '8'
                    && i != '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (!check(s))
                System.out.println("INVALID");
            else {
                if (s.length() % 2 != 0) {
                    int chan = 0, le = 0;
                    char[] a = s.toCharArray();
                    for (char i : a) {
                        if ((i - '0') % 2 == 0)
                            chan++;
                        else
                            le++;
                    }
                    if (le > chan)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                } else {
                    int chan = 0, le = 0;
                    char[] a = s.toCharArray();
                    for (char i : a) {
                        if ((i - '0') % 2 == 0)
                            chan++;
                        else
                            le++;
                    }
                    if (le < chan)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
