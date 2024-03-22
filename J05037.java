import java.util.*;

class HangHoa implements Comparable<HangHoa> {
    private String ma,ten,doiViTinh;
    private Double giaNhap,soLuong,vanChuyen,thanhTien,banLe;
    private static int cnt = 1;
    public HangHoa(String ten, String doiViTinh, Double giaNhap, Double soLuong) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.doiViTinh = doiViTinh;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.vanChuyen = (giaNhap*soLuong)/20;
        this.thanhTien = (giaNhap*soLuong) + (giaNhap*soLuong)/20;
        this.banLe = ((giaNhap*soLuong) + (giaNhap*soLuong)/20 + ((giaNhap*soLuong) + (giaNhap*soLuong)/20)/50)/soLuong;
    }
    @Override
    public int compareTo(HangHoa o) {
        return Double.compare(o.banLe, this.banLe);
    }
    @Override
    public String toString() {
        return  ma + " " + ten + " " + doiViTinh + " " + Math.round(vanChuyen)
                + " " + Math.round(thanhTien) + " " + (long)Math.ceil(banLe/100)*100;
    }

    
    
}

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HangHoa> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            HangHoa A = new HangHoa(sc.nextLine(),sc.nextLine(),
            Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for(HangHoa i : list){
            System.out.println(i);
        }
    }
}
