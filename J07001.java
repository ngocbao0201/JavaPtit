import java.io.File;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("D:/java.txt"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
