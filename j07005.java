import java.io.*;

public class j07005 {
    public static void main(String[] args) throws IOException{
        DataInputStream a = new DataInputStream( new FileInputStream("DATA.IN"));
        int[] arr = new int[1000];
        for(int i=0;i<1000;i++){
            arr[i] = 0;
        }
        for(int i=0;i<100000;i++){
            int x = a.readInt();
            arr[x]++; 
        }
        for(int i=0;i<1000;i++){
            if(arr[i] > 0){
                System.out.println(i + " " + arr[i]);
            }
        }
        a.close();
    }
}
