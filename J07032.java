import java.io.*;
import java.util.*;

public class J07032 {
    static boolean check(int n){
        String s = String.valueOf(n);
        if(s.length() == 1) return false;
        if(s.length() % 2 == 0) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4'
            || s.charAt(i) == '6' || s.charAt(i) == '8') return false;
        }
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        int[] arr = new int[1000005];
        for(int i=0;i<1000005;i++){
            arr[i] = 0;
        }
        for(Integer i : list1){
            if(check(i)) arr[i]++;
        }
        for(Integer i : list2){
            if(check(i)) arr[i]++;
        }
        int cnt = 1;
        for(int i = 0;i<1000000;i++){
            if(cnt > 10) break;
            else{
                if( arr[i] > 0 && list2.contains(i) && list1.contains(i) ){
                    System.out.println(i + " " + arr[i]);
                    cnt++;
                }
            }
        }
    }
}
