import java.util.Scanner;

public class J03021 {
    static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            String a = "";
            for (char i : s.toCharArray()) {
                if (i == 'A' || i == 'B' || i == 'C')
                    a += String.valueOf('2');
                if (i == 'D' || i == 'E' || i == 'F')
                    a += String.valueOf('3');
                if (i == 'G' || i == 'H' || i == 'I')
                    a += String.valueOf('4');
                if (i == 'J' || i == 'K' || i == 'L')
                    a += String.valueOf('5');
                if (i == 'M' || i == 'N' || i == 'O')
                    a += String.valueOf('6');
                if (i == 'P' || i == 'Q' || i == 'R' || i == 'S')
                    a += String.valueOf('7');
                if (i == 'T' || i == 'U' || i == 'V')
                    a += String.valueOf('8');
                if (i == 'W' || i == 'X' || i == 'Y' || i == 'Z')
                    a += String.valueOf('9');
            }
            if (check(a))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
