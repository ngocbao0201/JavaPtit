import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    private String ma, ten;
    private double diem_uu_tien, diem_xet_tuyen;
    DecimalFormat df = new DecimalFormat("#.#");

    public ThiSinh() {
        this.ma = "";
        this.ten = "";
        this.diem_uu_tien = 0;
        this.diem_xet_tuyen = 0;
    }

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = "";
        double diem = toan * 2 + ly + hoa;
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for (String i : a) {
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        if (ma.contains("KV1")) {
            this.diem_uu_tien = 0.5;
            this.diem_xet_tuyen = diem + this.diem_uu_tien;
        } else if (ma.contains("KV2")) {
            this.diem_uu_tien = 1;
            this.diem_xet_tuyen = diem + this.diem_uu_tien;
        } else {
            this.diem_uu_tien = 2.5;
            this.diem_xet_tuyen = diem + this.diem_uu_tien;
        }
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.diem_xet_tuyen != o.diem_xet_tuyen) {
            return Double.compare(o.diem_xet_tuyen, this.diem_xet_tuyen);
        } else
            return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + df.format(diem_uu_tien) + " "
                + df.format(diem_xet_tuyen);
    }

    public double getDiem_xet_tuyen() {
        return diem_xet_tuyen;
    }

}

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            ThiSinh A = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        int n = Integer.parseInt(sc.nextLine());
        double diemchuan = list.get(n-1).getDiem_xet_tuyen();
        System.out.printf("%.1f",diemchuan);
        System.out.println();
        for(ThiSinh i : list){
            if(i.getDiem_xet_tuyen() >= diemchuan){
                System.out.println(i + " TRUNG TUYEN");
            }
            else System.out.println(i + " TRUOT");
        }
    }
}
