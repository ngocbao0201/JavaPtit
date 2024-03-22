import java.util.*;

class NhanVien {
    private String ma,ten,chucVu;
    private long luong,soNgay,luongThang,tienThuong,phuCap,thuNhap;
    private static int cnt = 1;
    public NhanVien(String ten, long luong, long soNgay, String chucVu) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.soNgay = soNgay;
        this.luongThang = luong*soNgay;
        if(soNgay >= 25 ) this.tienThuong = (luong*soNgay)/5;
        else if(soNgay < 22 ) this.tienThuong = 0;
        else this.tienThuong = (luong*soNgay)/10;
        if(chucVu.equals("GD")) this.phuCap = 250000;
        else if( chucVu.equals("PGD")) this.phuCap = 200000;
        else if(chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        this.thuNhap = this.luongThang + this.tienThuong + this.phuCap;
    }
    @Override
    public String toString() {
        return  ma + " " + ten + " "  +  luongThang
                + " " + tienThuong + " " + phuCap + " " + thuNhap;
    }
        
}

public class J05040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            NhanVien A = new NhanVien(sc.nextLine(), Long.parseLong(sc.nextLine()), 
            Long.parseLong(sc.nextLine()), sc.nextLine());
            System.out.println(A);
        }
    }
}
