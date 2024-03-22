import java.util.*;

class SinhVien {
    private String ma,ten,lop,email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + email;
    }
   
}

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for( int i=1;i<=t;i++){
            SinhVien A = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        int m = Integer.parseInt(sc.nextLine());
        for( int i=1;i<=m;i++){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(SinhVien j : list){
                if(j.getLop().equals(s)) System.out.println(j);
            }
        }
        sc.close();
    }
}
