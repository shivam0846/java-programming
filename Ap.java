import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        //  System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=3*n+1;i+=3){
         System.out.print(i+ " ");
        }   
    }
}
