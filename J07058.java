import java.io.*;
import java.util.*;

class MonHoc implements Comparable <MonHoc> {
    private String ma,ten,hinh_thuc_thi;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, String hinh_thuc_thi) {
        this.ma = ma;
        this.ten = ten;
        this.hinh_thuc_thi = hinh_thuc_thi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + hinh_thuc_thi;
    }
    
}

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            MonHoc A = new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(MonHoc i : list){
            System.out.println(i);
        }
    }
}
