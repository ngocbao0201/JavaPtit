import java.util.*;

class GiangVien implements Comparable<GiangVien> {
    private String ma, hoten, mon, ten, mamonhoc;
    private static int cnt=1;

    public GiangVien() {
    }

    public GiangVien(String hoten, String mon) {
        this.ma = String.format("GV%02d", cnt++);
        this.hoten = hoten;
        this.mon = mon;
        String[] a = hoten.toLowerCase().split(" ");
        this.ten = a[a.length-1];
        this.mamonhoc = "";
        String[] b = mon.toUpperCase().split(" ");
        for(String i : b){
            this.mamonhoc += i.charAt(0);
        }
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.ten != o.ten ) return this.ten.compareTo(o.ten);
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return  ma + " " + hoten + " " + mamonhoc;
    }
    
}

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        for( int i=1;i<=t;i++){
            GiangVien A = new GiangVien(sc.nextLine(),sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(GiangVien i : list){
            System.out.println(i);
        }
        sc.close();
    }
}
