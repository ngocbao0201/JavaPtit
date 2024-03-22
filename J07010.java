import java.io.*;
import java.util.*;

class SinhVien {
    private String ma, ten, lop, ngaysinh;
    private double gpa;
    private static int cnt = 1;

    public SinhVien() {
    }

    public SinhVien(String ten, String lop, String ngaysinh, double gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        this.ngaysinh = "";
        String[] a = ngaysinh.split("/");
        if(a[0].length() < 2) this.ngaysinh += "0" + a[0];
        else this.ngaysinh += a[0];
        this.ngaysinh += "/";
        if(a[1].length() < 2) this.ngaysinh += "0" + a[1];
        else this.ngaysinh += a[1];
        this.ngaysinh += "/";
        this.ngaysinh += a[2];
        
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public double getGpa() {
        return gpa;
    }

}

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= t; i++) {
                SinhVien A = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                        Double.parseDouble(sc.nextLine()));
                System.out.printf("%s %s %s %s %.2f", A.getMa(), A.getTen(), A.getLop(), A.getNgaysinh(), A.getGpa());
                System.out.println();
            }
        }
    }
}
