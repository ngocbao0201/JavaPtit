import java.io.*;
import java.util.*;

class MatHang implements Comparable<MatHang> {
    private String ma, ten, nhom;
    private double gia_mua, gia_ban, loi_nhuan;
    private static int cnt = 1;

    public MatHang() {
    }

    public MatHang(String ten, String nhom, double gia_mua, double gia_ban) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
        this.loi_nhuan = gia_ban - gia_mua;
    }

    @Override
    public int compareTo(MatHang o) {
        return (int) (o.loi_nhuan - this.loi_nhuan);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public double getLoi_nhuan() {
        return loi_nhuan;
    }

}

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<MatHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            MatHang A = new MatHang(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for (MatHang i : list) {
            System.out.printf("%s %s %s %.2f", i.getMa(), i.getTen(), i.getNhom(), i.getLoi_nhuan());
            System.out.println();
        }
    }
}
