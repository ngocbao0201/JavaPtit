import java.io.*;
import java.util.*;

class SinhVien implements Comparable <SinhVien> {
    private String ma,ho_ten,sdt,email,ten,dem,ho;

    public SinhVien() {
    }

    public SinhVien(String ma, String ho_ten, String sdt, String email) {
        this.ma = ma;
        this.ho_ten = ho_ten;
        this.sdt = sdt;
        this.email = email;
        String[] a = ho_ten.split(" ");
        this.ten = a[a.length - 1];
        this.ho = a[0];
        this.dem = "";
        for(int i=1;i<a.length-1;i++){
            this.dem += a[i] + " ";
        }
        this.dem = this.dem.trim();
    }

    @Override
    public int compareTo(SinhVien o) {
        if( !this.ten.equals(o.ten) ) return this.ten.compareTo(o.ten);
        else if( !this.ho.equals(o.ho) ) return this.ho.compareTo(o.ho);
        else if( !this.dem.equals(o.dem) ) return this.dem.compareTo(o.dem);
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ho_ten + " " + sdt + " " + email;
    }

    

    
}

public class J07081 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("D:/java.txt"));
        ArrayList<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            SinhVien A = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.println(i);
        }
    }
}
