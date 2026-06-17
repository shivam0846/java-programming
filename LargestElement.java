import java.util.ArrayList;
public class LargestElement {
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<Integer>();
         list.add(23);
         list.add(12);
           list.add(45);
             list.add(94);
               list.add(67);
               int max=list.get(0);
               for(int i=1;i<list.size();i++){
                if(list.get(i)>max){
                    max=list.get(i);
                }
               }
               System.out.println("Largest element is: " + max);
    }
    
}
