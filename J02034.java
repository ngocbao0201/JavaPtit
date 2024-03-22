import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            a.add(sc.nextInt());
        if (a.size() == n && a.get(n - 1) == n)
            System.out.println("Excellent!");
        else {
            int[] check = new int[205];
            for (int i = 1; i <= 200; i++)
                check[i] = 0;
            for (int i : a)
                check[i] = 1;
            for (int i = 1; i <= a.get(n - 1); i++) {
                if (check[i] == 0)
                    System.out.println(i);
            }
        }
        sc.close();
    }
}
