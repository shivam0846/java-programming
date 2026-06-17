import java.util.*;
public class RemoveEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer>Numbers=new ArrayList<Integer>();
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(15);
        Numbers.add(7);
        Numbers.removeIf(n-> (n%2==0));
        for(int i:Numbers){
            System.out.println(i);
        }
    }
    
}
