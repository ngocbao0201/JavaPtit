import java.util.*;

public class J03004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s;
            s = sc.nextLine();
            s = s.toLowerCase().trim();
            //s = s.replaceAll("\\s+"," ");
            String[] a = s.split("\\s+");
            for( String i : a){
                System.out.print( String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
