
import java.text.ParseException;
import java.util.*;



public class test {
    static boolean check(int n){
        String s = String.valueOf(n);
        if(s.length() == 1) return false;
        if(s.length() % 2 == 0) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4'
            || s.charAt(i) == '6' || s.charAt(i) == '8') return false;
        }
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        int j = 1;
        for(int i=0;i<=100000;i++){
            if(j>10) break;
            else{
                if( check(i) ){ System.out.println(i);
                j++;
                }
            }
        }
    }
}
