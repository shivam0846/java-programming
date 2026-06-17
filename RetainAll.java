import java.util.ArrayList;
import java.util.Arrays;
public class RetainAll {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("java","Python","C++"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("java","C++"));
        list1.retainAll(list2);
        System.out.println(list1);
    }
    
}
