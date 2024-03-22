
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class J07030 {
    static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        Collections.sort(list1);
        Collections.sort(list2);
        int i = 0;
        int j = list2.size()-1;
        while( i < list1.size() || j>=0 ){
            int n = list1.get(i);
            int m = list2.get(j);
            if(m<=n) break;
            if(m+n == 1000000){
                if( check(n) && check(m) ) System.out.println(n + " " + m);
                i++;
                j--;
            }
            else if(m+n > 1000000){
                j--;
            }
            else i++;
        }
    }
}
