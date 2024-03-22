import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s;
            s = sc.nextLine();
            s = s.toLowerCase().trim();
            String[] a = s.split("\\s+");
            for (int i = 1; i < a.length; i++) {
                if (i == a.length - 1)
                    System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + ", ");
                else
                    System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ");
            }
            System.out.print(a[0].toUpperCase());
            System.out.println();
        }
        sc.close();
    }
}
