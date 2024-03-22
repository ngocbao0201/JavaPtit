import java.io.*;
import java.util.*;

class KhachHang implements Comparable<KhachHang> {
    private String ma,ten;
    private long tienTrongDinhMuc,tienVuotDinhMuc,VAT,tienNop,dinhMuc;
    private static int cnt = 1;

    public KhachHang(String ten, String s) {
        this.ma = String.format("KH%02d",cnt++);
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        String[] b = s.split(" ");
        if(b[0].equals("A")) this.dinhMuc = 100;
        else if(b[0].equals("B")) this.dinhMuc = 500;
        else this.dinhMuc = 200;
        long soDau = Long.parseLong(b[1]);
        long soCuoi = Long.parseLong(b[2]);
        long soDien = soCuoi - soDau;
        if(soDien < this.dinhMuc){
            this.tienTrongDinhMuc = soDien*450;
            this.tienVuotDinhMuc = 0;
        }
        else{ 
            this.tienTrongDinhMuc = this.dinhMuc*450;
            this.tienVuotDinhMuc = (soDien - this.dinhMuc)*1000;
        }
        this.VAT = this.tienVuotDinhMuc/20;
        this.tienNop = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.VAT;
    }

    @Override
    public int compareTo(KhachHang o) {
        return (int) (o.tienNop-this.tienNop) ;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienTrongDinhMuc + " "
                + tienVuotDinhMuc + " " + VAT + " " + tienNop;
    }
    
}

public class J07056 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("KHACHHANG.in"));
        List<KhachHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            KhachHang A = new KhachHang(sc.nextLine(), sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(KhachHang i : list){
            System.out.println(i);
        }
    }
}
