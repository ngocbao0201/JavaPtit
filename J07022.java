import java.util.*;
import java.io.*;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int i = Integer.parseInt(s);
                //list.add(i);
            }
            catch(Exception e){
                list.add(s);
            }
            
        }
        Collections.sort(list);
        for(String i : list) System.out.print(i + " ");
        sc.close();
    }
}
