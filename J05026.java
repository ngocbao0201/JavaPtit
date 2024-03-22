import java.util.*;

class GiangVien {
    private String ma,hoten,mon,mamonhoc;
    private static int cnt = 1;
    
    public GiangVien() {
    }

    public GiangVien(String hoten, String mon) {
        this.ma = String.format("GV%02d", cnt++);
        this.hoten = hoten;
        this.mon = mon;
        this.mamonhoc = "";
        String[] a = mon.toUpperCase().split(" ");
        for(String i : a){
            mamonhoc += i.charAt(0);
        }
    }

    public String getMamonhoc() {
        return mamonhoc;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + mamonhoc;
    }
  
}

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        for( int i=1;i<=t;i++ ){
            GiangVien A = new GiangVien(sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=m;i++){
            String s = sc.nextLine();
            String[] a = s.toUpperCase().split(" ");
            String ma = "";
            for(String j : a){
                ma += j.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + ma + ":");
            for(GiangVien j : list){
                if( j.getMamonhoc().equals(ma) ) System.out.println(j);
            }
        }
        sc.close();
    }
}
