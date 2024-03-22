import java.util.*;

class SinhVien implements Comparable<SinhVien> {
    private String ma,ten,lop;
    private double diem1,diem2,diem3;

    public SinhVien(String ma, String ten, String lop, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getDiem1() {
        return String.format("%.1f", diem1);
    }

    public String getDiem2() {
        return String.format("%.1f", diem2);
    }

    public String getDiem3() {
        return String.format("%.1f", diem3);
    }


    
    @Override
    public int compareTo(SinhVien o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", ma,ten,lop,getDiem1(),getDiem2(),getDiem3());
    }
    
    
}

public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for( int i=1;i<=t;i++){
            SinhVien A = new SinhVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
             Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
             list.add(A);
        }
        Collections.sort(list);
        for(int i=1;i<=list.size();i++){
            System.out.print(i + " ");
            System.out.print(list.get(i-1));
            System.out.println();
        }
        sc.close();
    }
}
