import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029 {
    static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) o.readObject();
        int[] arr = new int[1000005];
        for(int i=0;i<1000000;i++){
            arr[i] = 0;
        }
        for(Integer i : list){
            if(check(i)) arr[i]++;
        }
        int j=1;
        for(int i=999999;i>0;i--){
            if(j>10) break;
            else{
                if(arr[i]>0){
                System.out.println(i + " " + arr[i]);
                j++;
            }
            }
        }
    }
}
