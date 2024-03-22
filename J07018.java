import java.io.*;
import java.util.*;

class SinhVien {
    private String ma,ten,lop,ngaysinh;
    private double gpa;
    private static int cnt=1;

    public SinhVien(String ten, String lop, String ngaysinh, double gpa) {
        this.ma = String.format("B20DCCN%03d", cnt++);
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        this.lop = lop;
        this.ngaysinh = "";
        String[] b = ngaysinh.split("/");
        if(b[0].length() < 2) this.ngaysinh += "0" + b[0];
        else this.ngaysinh += b[0];
        this.ngaysinh += "/";
        if(b[1].length() < 2) this.ngaysinh += "0" + b[1];
        else this.ngaysinh += b[1];
        this.ngaysinh += "/";
        this.ngaysinh += b[2];
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", gpa);
    }
    
}

public class J07018 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            SinhVien A = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            System.out.println(A);
        }
    }
}
