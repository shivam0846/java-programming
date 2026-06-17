import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        Stack<String> Stack=new Stack<String>();
        Stack.push("Ayush");
        Stack.push("Shivam");
        Stack.push("Ram");
         Stack.push("Rahul");
        Stack.pop();
        Iterator<String>itr=Stack.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
    
}
}
}

