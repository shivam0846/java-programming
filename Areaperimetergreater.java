import java.util.Scanner;
public class Areaperimetergreater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length");
        int Length=sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth=sc.nextInt();
        int area=Length*breadth;
        int perimeter=2*(Length+breadth);
        if(area > perimeter){
            System.out.println("Area is greater than perimeter");
        }
        else{
         System.out.println("Perimeter is greater than area"); 
        }

    }
}
    

