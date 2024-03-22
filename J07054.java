import java.io.*;
import java.util.*;

class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, diemTB;
    private int rank;
    private static int cnt = 1;

    public SinhVien(String ten, int diem1, int diem2, int diem3) {
        this.ma = String.format("SV%02d", cnt++);
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for (String i : a) {
            this.ten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.ten = this.ten.trim();
        double b = (double) (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
        this.diemTB = String.format("%.2f", b);
    }

    public double getDiemTB() {
        return Double.parseDouble(this.diemTB);
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(SinhVien o) {
        return Double.compare(o.getDiemTB(), this.getDiemTB());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTB + " " + rank;
    }

}

public class J07054 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        Map<Double, Integer> map = new LinkedHashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            SinhVien A = new SinhVien(sc.nextLine(), Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            list.add(A);
        }
        Collections.sort(list);
        for (SinhVien i : list) {
            if (map.containsKey(i.getDiemTB())) {
                int x = map.get(i.getDiemTB());
                x++;
                map.replace(i.getDiemTB(), x);
            } else {
                map.put(i.getDiemTB(), 1);
            }
        }
        int x = 1;
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            for (SinhVien i : list) {
                if (i.getDiemTB() == entry.getKey()) {
                    i.setRank(x);
                }
            }
            x += entry.getValue();
        }
        for(SinhVien i : list){
            System.out.println(i);
        }
    }
}
