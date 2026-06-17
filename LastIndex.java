import java.util.ArrayList;
import java.util.Arrays;
public class LastIndex {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(
        Arrays.asList("A","B","C","B","D"));
        System.out.println(list.lastIndexOf("B"));
    }
    
}
