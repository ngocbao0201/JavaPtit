import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.nextLine().trim();
            String b = sc.nextLine().trim();
            String[] a1 = a.split("\\s+");
            String[] b1 = b.split("\\s+");
            TreeSet<String> s1 = new TreeSet<>();
            TreeSet<String> s2 = new TreeSet<>();
            for (String i : b1) {
                s2.add(i);
            }
            for (String i : a1) {
                if (!s2.contains(i))
                    s1.add(i);
            }
            for (String i : s1)
                System.out.print(i + " ");
            System.out.println();
        }
        sc.close();
    }
}
