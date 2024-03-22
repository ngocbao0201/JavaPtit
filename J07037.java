import java.util.*;
import java.io.*;

class DoanhNghiep implements Comparable <DoanhNghiep> {
    private String ma,ten;
    private int so_luong_sinh_vien;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String ten, int so_luong_sinh_vien) {
        this.ma = ma;
        this.ten = ten;
        this.so_luong_sinh_vien = so_luong_sinh_vien;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + so_luong_sinh_vien;
    }

    
    
}

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("DN.in"));
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        while(sc.hasNextLine()){
            int t = Integer.parseInt(sc.nextLine());
            for(int i=1;i<=t;i++){
                DoanhNghiep A = new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
                list.add(A);
            }
        }
        Collections.sort(list);
        for(DoanhNghiep i : list){
            System.out.println(i);
        }
    }
}
