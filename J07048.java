import java.io.*;
import java.util.*;

class SanPham implements Comparable <SanPham> {
    private String ma,ten;
    private int gia_ban,bao_hanh;
    
    public SanPham() {
    }

    public SanPham(String ma, String ten, int gia_ban, int bao_hanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia_ban = gia_ban;
        this.bao_hanh = bao_hanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if( this.gia_ban != o.gia_ban ) return o.gia_ban-this.gia_ban;
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + gia_ban + " " + bao_hanh;
    }

    
    
}

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File ("D:/java.txt"));
        ArrayList<SanPham> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            SanPham A = new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for(SanPham i : list){
            System.out.println(i);
        }
    }
}
