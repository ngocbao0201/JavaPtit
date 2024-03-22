import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {

    static boolean check(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) o.readObject();
        int[] arr = new int[10000];
        for(int i=0;i<10000;i++){
            arr[i] = 0;
        }
        for(Integer i : list){
            if(check(i)) arr[i]++;
        }
        for(int i=0;i<10000;i++){
            if(check(i) && arr[i] > 0) System.out.println(i + " " + arr[i]);
        }
    }
}
