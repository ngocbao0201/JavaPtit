import java.util.*;

class SinhVien implements Comparable<SinhVien> {
    private String ma,ten,lop,email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }

    
}

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        while(sc.hasNextLine()){
            SinhVien A = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(SinhVien i : list){
            System.out.println(i);
        }
        sc.close();
    }
}
