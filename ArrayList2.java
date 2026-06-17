import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> ArrLis = new ArrayList<Integer>();
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);

        System.out.println("Array List: " + ArrLis);

        Object[] arr = ArrLis.toArray();
        System.out.println("Elements of ArrayList as Array: " + Arrays.toString(arr)); 
         
    }
}
