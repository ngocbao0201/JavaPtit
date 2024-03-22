import java.util.*;

class SinhVien implements Comparable<SinhVien> {
    private String ma,ten,lop,email,DN;
    private int stt;

    public SinhVien(int stt,String ma, String ten, String lop, String email, String dN) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        DN = dN;
    }

    public String getDN() {
        return DN;
    }

    @Override
    public String toString() {
        return stt + " " + ma + " " + ten + " " + lop + " " + email + " " + DN;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ten.compareTo(o.ten);
    }

}

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            SinhVien A = new SinhVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0;i<m;i++){
            String s = sc.nextLine();
            for(SinhVien j : list){
                if(s.equals(j.getDN())){
                    System.out.println(j);
                }
            }
        }
    }
}
