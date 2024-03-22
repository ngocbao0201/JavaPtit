import java.util.*;

class DonHang {
    private String ma,ten,stt;
    private long donGia,soLuong,giamGia,thanhTien;
    public DonHang(String ten, String ma, long donGia, long soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.stt = ma.substring(1,4);
        this.donGia = donGia;
        this.soLuong = soLuong;
        if(ma.charAt(ma.length()-1) == '1') this.giamGia = (donGia*soLuong)/2;
        else this.giamGia = (donGia*soLuong)*3/10;
        this.thanhTien = this.donGia*this.soLuong - this.giamGia;
    }
    @Override
    public String toString() {
        return ten + " " + ma + " " + stt + " " + giamGia + " "
                + thanhTien;
    }

}

public class J05052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            DonHang A = new DonHang(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),
            Long.parseLong(sc.nextLine()));
            System.out.println(A);
        }
    }
}
