import java.util.*;

class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma,ten;
    private int soluong;
    
    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String ten, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.soluong != o.soluong) return o.soluong - this.soluong;
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + soluong;
    }

    
}

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            DoanhNghiep A = new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        int m = sc.nextInt();
        for( int i=1;i<=m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep j : list){
                if(j.getSoluong() >= a && j.getSoluong() <=b ) System.out.println(j);
            }
        }
        
        sc.close();
    }
}
