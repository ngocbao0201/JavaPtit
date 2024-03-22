import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class KhachHang implements Comparable <KhachHang> {
    private String ma,ten,ma_phong;
    private Date ngay_den,ngay_di;
    private long so_ngay_luu_tru;
    private static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String ten, String ma_phong, Date ngay_den, Date ngay_di) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.ma_phong = ma_phong;
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
        long days = ngay_di.getTime() - ngay_den.getTime();
        this.so_ngay_luu_tru = TimeUnit.MILLISECONDS.toDays(days);
    }



    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.so_ngay_luu_tru, this.so_ngay_luu_tru);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + ma_phong + " " + so_ngay_luu_tru;
    }

    
    
    
}

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner (new File("D:/java.txt"));
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<KhachHang> list = new ArrayList<>();

            int t = Integer.parseInt(sc.nextLine());
            for(int i=1;i<=t;i++){
                KhachHang A = new KhachHang(sc.nextLine(),sc.nextLine(),date.parse(sc.nextLine()),date.parse(sc.nextLine()));
                list.add(A);
            }
        
        Collections.sort(list);
        for(KhachHang i : list){
            System.out.println(i);
        }
    }
}
