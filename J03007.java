import java.util.*;

public class J03007 {
    static boolean solve(String s){
        char[] a = s.toCharArray();
        int sum=0;
        if( s.charAt(0) != '8') return false;
        if( s.charAt(s.length()-1) != '8') return false;
        for(int i=0;i<s.length();i++){
            if( a[i] != a[s.length()-1-i] ) return false;
            sum += (s.charAt(i) - '0');
        }
        if( sum % 10 != 0 ) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            if( solve(s) ) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
