import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> passanger =new LinkedList<>();
        passanger.offer("Amit");
        passanger.offer("Rahul");
        passanger.offer("sneha");
        System.out.println("peek()" + passanger.peek());
        System.out.println("peek First()" + passanger.peekFirst());
        System.out.println("peek Last()" + passanger.peekLast());



        
    }

    
}
