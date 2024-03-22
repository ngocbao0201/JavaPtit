import java.util.*;

class NhanVien implements Comparable<NhanVien> {
    private String ma,ten;
    private long phuCap,luongChinh,tamUng,conLai,soTienNhan;
    private static int cnt=1;

    public NhanVien(String ten, String chucVu, long luongCoBan, long soNgayCong) {
        this.ma = String.format("NV%02d", cnt++);
        this.ten = ten;
        this.luongChinh = luongCoBan * soNgayCong;
        if(chucVu.equals("GD")) this.phuCap = 500;
        else if(chucVu.equals("PGD")) this.phuCap = 400;
        else if(chucVu.equals("TP")) this.phuCap = 300;
        else if(chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        if( (this.phuCap+this.luongChinh)*2/3 < 25000 ) 
        this.tamUng = Math.round( (double) ((this.phuCap+this.luongChinh)*2/3)/1000 ) * 1000;
        else this.tamUng = 25000;
        this.soTienNhan = this.luongChinh + this.phuCap;
        this.conLai = this.soTienNhan - this.tamUng;
    }

    @Override
    public int compareTo(NhanVien o) {
        return (int) (o.soTienNhan-this.soTienNhan);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCap + " " + luongChinh + " " + tamUng + " "
                + conLai  ;
    }
    
}

public class j05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            NhanVien A = new NhanVien(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),
            Long.parseLong(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for(NhanVien i : list){
            System.out.println(i);
        }
    }
}
