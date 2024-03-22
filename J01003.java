import java.util.*;

public class J01003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if( a==0 && b != 0 ) System.out.println("VN");
        else if( a==0 && b==0 ) System.out.println("VSN");
        else if( a!=0 && b==0 ){ 
            System.out.println(String.format("%.2f",b));
        }
        else{
            double c = (-b)/a;
            System.out.println(String.format("%.2f",c));
        }
        sc.close();
    }
}
