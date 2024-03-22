import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class j07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) o.readObject();
        int[] arr = new int[1000];
        for(int i=0;i<1000;i++){
            arr[i] = 0;
        }
        for(Integer i : list){
            arr[i]++;
        }
        for(int i=0;i<1000;i++){
            if(arr[i] > 0) System.out.println(i + " " + arr[i]);
        }
    }
}
