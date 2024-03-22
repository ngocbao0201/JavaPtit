import java.util.*;
import java.io.*;

public class J07008 {
    static int[] a = new int[10001];

    static void khoitao(int n) {
        for (int i = 1; i <= n; i++) {
            a[i] = 0;
        }
    }

    static void sinh(int n) {
        int j = n + 1;
        for (int i = n; i >= 1; i--) {
            if (a[i] == 0) {
                a[i] = 1;
                j = i + 1;
                break;
            }
        }
        for (int i = j; i <= n; i++) {
            if (a[i] == 0)
                a[i] = 1;
            else
                a[i] = 0;
        }
    }

    static boolean check(int n) {
        for (int i = 1; i <= n; i++) {
            if (a[i] == 0)
                return false;
        }
        return true;
    }

    static boolean check2(int[] b, int n) {
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1)
                v.add(b[i]);
        }
        if (v.size() == 1)
            return false;
        for (int i = 0; i < v.size() - 1; i++) {
            if (v.get(i + 1) < v.get(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            int[] b = new int[10001];
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }
            khoitao(n);
            while (!check(n)) {
                sinh(n);
                if (check2(b, n)) {
                    String s = "";
                    for (int i = 1; i <= n; i++) {
                        if (a[i] == 1)
                            s += (String.valueOf(b[i]) + " ");
                    }
                    list.add(s);
                }
            }
            Collections.sort(list);
            for (String i : list)
                System.out.println(i);

        }
    }

}
