import java.util.*;

class HocSinh implements Comparable<HocSinh> {
    private String ma, ten, xeploai;
    private double diem1, diem2, diem3, diem4, diem5, diem6, diem7, diem8, diem9, diem10, diemTB;
    private static int cnt = 1;

    public HocSinh() {
    }

    public HocSinh(String ten, double diem1, double diem2, double diem3, double diem4, double diem5, double diem6,
            double diem7, double diem8, double diem9, double diem10) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diem4 = diem4;
        this.diem5 = diem5;
        this.diem6 = diem6;
        this.diem7 = diem7;
        this.diem8 = diem8;
        this.diem9 = diem9;
        this.diem10 = diem10;
        this.diemTB = (diem1 * 2 + diem2 * 2 + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 + diem10) / 12;

        if(diemTB >= 9) this.xeploai = "XUAT SAC";
        else if(diemTB >= 8.0 && diemTB < 9.0) this.xeploai = "GIOI";
        else if(diemTB >= 7.0 && diemTB < 8.0) this.xeploai = "KHA";
        else if (diemTB >= 5.0 && diemTB < 7.0) this.xeploai = "TB";
        else this.xeploai = "YEU";
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getXeploai() {
        return xeploai;
    }

    @Override
    public int compareTo(HocSinh o) {
        return 0 - (Double.compare(this.diemTB, o.diemTB));
    }

}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            HocSinh A = new HocSinh(sc.nextLine(),sc.nextDouble(),sc.nextDouble(),
            sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),
            sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            list.add(A);
        }
        Collections.sort(list);
        for(HocSinh i : list){
            System.out.printf("%s %s %.1f %s", i.getMa(), i.getTen(), Math.round(i.getDiemTB()*10.0)/10.0, i.getXeploai());
            System.out.println();
        }
        sc.close();
    }

}