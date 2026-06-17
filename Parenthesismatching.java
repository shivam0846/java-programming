import java.util.*;
class Pranthesismatching{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
           else {
                if (st.isEmpty()) {
                    ans = i + 1;
                }
                char t = st.pop();
                if ((c == ')' && t != '(') ||
                    (c == '}' && t != '{') ||
                    (c == ']' && t != '[')) {
                    ans = i + 1;
                }
            }
        }
        if (ans == 0 && !st.isEmpty())
            ans = s.length();
        System.out.println(ans);
    }
}