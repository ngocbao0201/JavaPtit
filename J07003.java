import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            int l = s.length();
            while(l>1){
                BigInteger a = new BigInteger( s.substring(0, l/2) );
                BigInteger b = new BigInteger( s.substring(l/2) );
                BigInteger c = a.add(b);
                s = c.toString();
                System.out.println(s);
                l = s.length();
            }
        }
        sc.close();
    }
}
