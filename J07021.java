import java.util.*;
import java.io.*;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            else {
                String[] a = s.trim().toLowerCase().split("\\s+"); 
                for(String i : a){
                    System.out.print(Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ");
                }
                System.out.println();
            }
        }
    }
}
