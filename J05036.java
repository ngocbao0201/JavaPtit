import java.util.*;

class HangHoa {
    private String ma,ten,donvitinh;
    private double gianhap,soluong,vchuyen,thanhtien,giaban;
    private static int cnt=1;
    public HangHoa(String ten, String donvitinh, double gianhap, double soluong) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.vchuyen = (gianhap*soluong)/20;
        this.thanhtien = (gianhap*soluong) + (gianhap*soluong)/20;
        this.giaban = (gianhap*soluong) + (gianhap*soluong)/20 + ((gianhap*soluong) + (gianhap*soluong)/20)/50;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + donvitinh + " " + Math.round(vchuyen)
                + " " + Math.round(thanhtien) + " " + Math.round(giaban);
    }

}

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            HangHoa A = new HangHoa(sc.nextLine(), sc.nextLine(),
             Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
             System.out.println(A);
        }
    }
}
