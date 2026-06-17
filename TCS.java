import java.util.*;
public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int key = sc.nextInt();
        if (key < 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        key = key % 26; 
        StringBuilder ans = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char)('A' + (ch - 'A' + key) % 26));
            } 
            else if (ch >= 'a' && ch <= 'z') {
                ans.append((char)('a' + (ch - 'a' + key) % 26));
            } 
            else if (ch >= '0' && ch <= '9') {
                ans.append((char)('0' + (ch - '0' + key) % 10));
            } 
            else {
                ans.append(ch); 
            }
        }
        System.out.println(ans);
    }
} 