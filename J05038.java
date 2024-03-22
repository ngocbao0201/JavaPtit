import java.util.*;

class NhanVien {
    private String ma,ten,chucVu;
    private long luongNgay,soNgayCong,luongThang,thuong,phuCap,thucLinh;
    private static int cnt=1;

    public NhanVien(String ten, long luongNgay, long soNgayCong, String chucVu) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.luongThang = luongNgay*soNgayCong;
        if(soNgayCong>=25) this.thuong = (luongNgay*soNgayCong)/5;
        else if(soNgayCong<22) this.thuong = 0;
        else this.thuong = (luongNgay*soNgayCong)/10;
        if(chucVu.equals("GD")) this.phuCap = 250000;
        else if(chucVu.equals("PGD")) this.phuCap = 200000;
        else if(chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        this.thucLinh = this.luongThang + this.thuong + this.phuCap;
    }

    public long getThucLinh() {
        return thucLinh;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + luongThang + " " + thuong + " "
                + phuCap + " " + thucLinh;
    }
     
}

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            NhanVien A = new NhanVien(sc.nextLine(),Long.parseLong(sc.nextLine()),
            Long.parseLong(sc.nextLine()),sc.nextLine());
            sum += A.getThucLinh();
            System.out.println(A);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
