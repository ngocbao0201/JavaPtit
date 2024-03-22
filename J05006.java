import java.util.*;

class NhanVien {

    private String ma,ten,gioitinh,ngaysinh,diachi,masothue,ngaykihopdong;
    private static int cnt=1;

    

    public NhanVien() {
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getNgaykihopdong() {
        return ngaykihopdong;
    }

    public void setNgaykihopdong(String ngaykihopdong) {
        this.ngaykihopdong = ngaykihopdong;
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
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + gioitinh + " " + ngaysinh + " "
                + diachi + " " + masothue + " " + ngaykihopdong;
    }
    
    

}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        for( int i=1;i<=t;i++){
            NhanVien A = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            System.out.println(A); 
        }
        sc.close();
    }
}
