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
        if( !this.lop.equals(o.lop))
        return this.lop.compareTo(o.lop);
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return   ma + " " + ten + " " + lop + " " + email;
    }

    

}

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for( int i=1;i<=t;i++){
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
