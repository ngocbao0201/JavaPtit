import java.io.*;
//import java.text.DecimalFormat;
import java.util.*;

class ThiSinh implements Comparable <ThiSinh> {
    private String ma,ten,trangthai,dantoc;
    private int khuvuc;
    private double tong;
    //private DecimalFormat df = new DecimalFormat("#.#");
    private static int cnt = 1;
    
    public ThiSinh() {
    }

    public ThiSinh(String ten, double diemthi, String dantoc, int khuvuc) {
        this.ma = String.format("TS%02d", cnt++);
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        this.tong = diemthi + this.getUutien();
        if(this.tong >= 20.5) this.trangthai = "Do";
        else this.trangthai = "Truot";
    }


    public double getUutien() {
        double d = 0;
        if(this.khuvuc == 1) d += 1.5;
        else if( this.khuvuc == 2) d += 1;
        else d += 0;
        if(this.dantoc.equals("Kinh")) return d;
        else return d + 1.5;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tong != o.tong) return Double.compare(o.tong, this.tong);
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + String.format("%.1f", tong) + " " + trangthai;
    }

}

public class J07057 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner( new File("D:/java.txt"));
        ArrayList<ThiSinh> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            ThiSinh A = new ThiSinh(sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),
            Integer.parseInt(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for(ThiSinh i : list){
            System.out.println(i);
        }
    }
}
