import java.util.*;
import java.io.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] arr = new int[100001];
        for(int i=0;i<100001;i++){
            arr[i] = 0;
        }
        while (sc.hasNext()) {
            int i = sc.nextInt();
            arr[i]++;
        }
        for(int i=0;i<100001;i++){
            if(arr[i] > 0){
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
