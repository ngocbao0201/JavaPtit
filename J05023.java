import java.util.*;

class SinhVien {
    private String ma,ten,lop,email,khoa;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.khoa = lop.substring(1, 3);
    }

    //protected String _getClass(){
   //     return this.lop.substring(1,3);
   // }

    public String getKhoa() {
        return khoa;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + email;
    }

    
}

public class J05023 {
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
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(SinhVien j : list){
               if(j.getKhoa().compareTo(s.substring(2)) == 0 ) System.out.println(j);
            }
        }
        sc.close();
    }
}
