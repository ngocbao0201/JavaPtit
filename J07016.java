import java.io.*;
import java.util.*;

public class J07016 {
    static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        int[] arr1 = new int[10001];
        for(int i=0;i<10000;i++){
            arr1[i] = 0;
        }
        int[] arr2 = new int[10001];
        for(int i=0;i<10000;i++){
            arr2[i] = 0;
        }
        for(Integer i : list1){
            if(check(i)) arr1[i]++;
        }
        for(Integer i : list2){
            if(check(i)) arr2[i]++;
        }
        for(int i=0;i<10000;i++){
            if(arr1[i] > 0 && arr2[i]>0) System.out.println(i + " " + arr1[i] + " " + arr2[i]);
        }
    }
}
