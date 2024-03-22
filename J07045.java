import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
    private String line,kihieu,ten,gia,phi;

    
    
    public LoaiPhong() {
    }


    public LoaiPhong( String line) {
        String[] a = line.split(" ");
        this.kihieu = a[0];
        this.ten = a[1];
        this.gia = a[2];
        this.phi = a[3];
    }


    @Override
    public int compareTo(LoaiPhong o) {
        return this.ten.compareTo(o.ten);
    }


    @Override
    public String toString() {
        return  kihieu + " " + ten + " " + gia + " " + phi;
    }


    
    
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
