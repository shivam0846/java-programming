import java.util.Scanner;
public class Divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("This number is  divisible by 5&&3");

        }
        else{
            System.out.println("Not divisible");
        }
        
    }
    
}
