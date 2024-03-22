import java.util.*;
import java.io.*;

class SinhVien implements Comparable<SinhVien> {
    private String ma,ten,lop,email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.lop = lop;
        this.email = email;
        String s = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            s += (Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ");
        }
        this.ten = s.trim();
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }

    
    
}

public class J07033 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        while(sc.hasNextLine()){
            int t = Integer.parseInt(sc.nextLine());
            for(int i=1;i<=t;i++){
                SinhVien A = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
                list.add(A);
            }
        }
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.println(i);
        }

    }
}
