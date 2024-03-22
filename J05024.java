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

    
    public String getNganh() {
        return ma.substring(3, 7);
    }
    public char getLop() {
        return lop.charAt(0);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + email;
    }
 
}

public class J05024 {
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
            String s = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            String[] a = s.split(" ");
            String ma = "DC" + a[0].charAt(0) + a[1].charAt(0);
            for(SinhVien j : list){
                if( j.getNganh().equals(ma) ){
                    if( ma.equals("DCCN") || ma.equals("DCAT")){
                        if(j.getLop() != 'E') System.out.println(j);
                    }
                    else System.out.println(j);
                }
            }
        }
        sc.close();
    }
}
