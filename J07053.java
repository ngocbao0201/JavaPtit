import java.io.*;
import java.util.*;

class ThiSinh {
    private String ma,ten,xeploai;
    private double diemthuong;
    private int tuoi,diemTB;
    private static int cnt=1;

    public ThiSinh() {
        this.ma = "";
        this.ten = "";
        this.tuoi = 0;
        this.xeploai = "";
        this.diemthuong = 0;
        this.diemTB = 0;
    }

    public ThiSinh(String ten, String ngaysinh, double lythuyet, double thuchanh) {
        this.ma = String.format("PH%02d", cnt++);
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        String[] b = ngaysinh.split("/");
        this.tuoi = 2021 - Integer.parseInt(b[2]);
        if(lythuyet >= 8 && thuchanh >= 8) this.diemthuong = 1;
        else if(lythuyet >= 7.5 && thuchanh >= 7.5) this.diemthuong = 0.5;
        else this.diemthuong = 0;
        double c = (lythuyet + thuchanh)/2 + this.diemthuong;
        this.diemTB = (int) Math.min(10,Math.round(c));
        if(this.diemTB < 5) this.xeploai = "Truot";
        else if(this.diemTB < 7) this.xeploai = "Trung binh";
        else if( this.diemTB == 7) this.xeploai = "Kha";
        else if(this.diemTB == 8) this.xeploai = "Gioi";
        else this.xeploai = "Xuat sac";
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " +  tuoi + " " + diemTB
                + " " + xeploai;
    }


    

}

public class J07053 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<ThiSinh> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            ThiSinh A = new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine()));
            list.add(A);
        }
        for(ThiSinh i : list){
            System.out.println(i);
        }
    }
}
