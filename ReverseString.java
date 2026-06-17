import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        String expression = "SHIVAM";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            stack.push(ch);
        }
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        System.out.println("Original String: " + expression);
        System.out.println("Reversed String: " + reverse);
    }
 {
    
 }
}
