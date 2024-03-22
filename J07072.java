import java.io.*;
import java.util.*;
class GV implements Comparable <GV>{
    private String hoten,ten,tendem,ho;

    public GV(String hoten) {
        this.hoten = "";
        String[] a = hoten.trim().toLowerCase().split("\\s+");
        for(String i : a){
            this.hoten += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        this.hoten = this.hoten.trim();
        this.ten = a[a.length-1];
        this.ho = a[0];
        this.tendem = "";
        for(int i=1;i<a.length-1;i++){
            this.tendem += a[i] + " ";
        }
        this.tendem = this.tendem.trim();
    }

    @Override
    public int compareTo(GV o) {
        if( !this.ten.equals(o.ten)) return this.ten.compareTo(o.ten);
        else if(!this.ho.equals(o.ho)) return this.ho.compareTo(o.ho);
        else return this.tendem.compareTo(o.tendem);
    }

    @Override
    public String toString() {
        return hoten;
    }

    
}

public class J07072 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<GV> list = new ArrayList<>();
        while(sc.hasNextLine()){
            GV A = new GV(sc.nextLine());
            list.add(A);
        }
        Collections.sort(list);
        for(GV i : list){
            System.out.println(i);
        }
    }
}
