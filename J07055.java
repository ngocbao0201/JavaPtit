import java.io.*;
import java.util.*;

class SinhVien implements Comparable <SinhVien> {
    private String ma,ten,xeploai;
    private double diemtk;
    private static int cnt=1;

    public SinhVien(String ten,int lt,int th,int thi) {
        this.ma = String.format("SV%02d",cnt++);
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        this.diemtk = (double)(lt * 0.25) + (double)(th * 0.35) + (double)(thi * 0.4);
        if(this.diemtk >= 8) this.xeploai = "GIOI";
        else if (this.diemtk >= 6.5) this.xeploai = "KHA";
        else if(this.diemtk >=5) this.xeploai = "TRUNG BINH";
        else this.xeploai = "KEM";
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.diemtk, this.diemtk);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getXeploai() {
        return xeploai;
    }

    public double getDiemtk() {
        return diemtk;
    }
    
}

public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("BANGDIEM.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            SinhVien A = new SinhVien(sc.nextLine(), Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.printf("%s %s %.2f %s", i.getMa(),i.getTen(),i.getDiemtk(),i.getXeploai());
            System.out.println();
        }
    }
}
