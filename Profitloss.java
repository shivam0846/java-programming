import java.util.Scanner;
public class Profitloss {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
              System.out.println("Enter cost price: " ); 
              int cp =Sc.nextInt();
              System.out.println("Enter selling price: " ); 
              int sp =Sc.nextInt();
              if(sp >cp){
              System.out.print("You gained profit is: ");
              System.out.println(sp-cp);
             }
             else {
                System.out.print("you gained loss is: ");
                System.out.println(cp-sp);
             }
             
    }
    
    }
