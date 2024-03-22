import java.util.*;

class NhanVien {
    private String ma,ten,chucVu;
    private double luong,soNgayCong,phuCap,luongChinh,tamUng,conLai;
    private static int cnt=1;

    public NhanVien(String ten, String chucVu, double luong, double soNgayCong) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.soNgayCong = soNgayCong;
        this.luongChinh = luong*soNgayCong;
        if(chucVu.equals("GD")) this.phuCap = 500;
        else if(chucVu.equals("PGD")) this.phuCap = 400;
        else if(chucVu.equals("TP")) this.phuCap = 300;
        else if(chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        if( (this.phuCap+this.luongChinh)*2/3 < 25000 ) 
        this.tamUng = Math.round( ((this.phuCap+this.luongChinh)*2/3)/1000 ) * 1000;
        else this.tamUng = 25000;
        this.conLai = this.luongChinh - this.tamUng + this.phuCap;
    }

    public String getChucVu() {
        return chucVu;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + (long)phuCap + " " + (long)luongChinh + " "
                + (long)tamUng + " " + (long)conLai;
    }

}

public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            NhanVien A = new NhanVien(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
            Double.parseDouble(sc.nextLine()));
            list.add(A);
        }
        String s = sc.nextLine();
        for(NhanVien i : list){
            if(i.getChucVu().equals(s)) System.out.println(i);
        }
    }
}

