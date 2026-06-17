import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>(Arrays.asList("abs","gfh","hfgf","ygf","hfhfh"));
        System.out.println("Original List" + names);
        List<String>sub=names.subList(1,4);
        System.out.println("SubList:"+sub);
    }
    
}
