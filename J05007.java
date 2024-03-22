import java.util.*;

class NhanVien implements Comparable<NhanVien> {
    private String ma, ten, gioitinh, ngaysinh, diachi, masothue, ngaykihopdong;
    private int ngay, thang, nam;
    private static int cnt = 1;

    public NhanVien() {
    }

    public NhanVien(String ten, String gioitinh, String ngaysinh, String diachi, String masothue,
            String ngaykihopdong) {
        this.ma = String.format("%05d", cnt++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykihopdong = ngaykihopdong;

        String[] a = ngaysinh.split("/");
        this.ngay = Integer.parseInt(a[0]);
        this.thang = Integer.parseInt(a[1]);
        this.nam = Integer.parseInt(a[2]);
    }

    @Override
    public int compareTo(NhanVien o) {
        if (this.nam != o.nam)
            return this.nam - o.nam;
        else if (this.thang != o.thang)
            return this.thang - o.thang;
        else
            return this.ngay - o.ngay;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + ngaysinh + " "
                + diachi + " " + masothue + " " + ngaykihopdong;
    }

    

}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for( int i=1;i<=t;i++){
            NhanVien A = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(NhanVien i : list){
            System.out.println(i);
        }
        sc.close();
    }
}
