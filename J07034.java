import java.util.*;
import java.io.*;

class MonHoc implements Comparable<MonHoc> {
    private String ma, ten;
    private int so_tin_chi;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, int so_tin_chi) {
        this.ma = ma;
        this.ten = ten;
        this.so_tin_chi = so_tin_chi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + so_tin_chi;
    }

}

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= t; i++) {
                MonHoc A = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                list.add(A);
            }
        }
        Collections.sort(list);
        for (MonHoc i : list) {
            System.out.println(i);
        }
    }
}
