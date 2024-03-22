import java.util.*;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int check = 1;
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    st.push(s.charAt(i));
                }
                else{
                    if(st.empty()) {
                        check = 0;
                        break;
                    } else if(s.charAt(i) == ')' && st.peek() == '('){
                        st.pop();
                    } else if(s.charAt(i) == ']' && st.peek() == '['){
                        st.pop();
                    } else if(s.charAt(i) == '}' && st.peek() == '{'){
                        st.pop();
                    } else {
                        check = 0;
                        break;
                    }
            }
            }
            if(!st.empty()) check = 0;
            if(check == 0) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}
