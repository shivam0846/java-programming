import java.util.Scanner;
public class Checkleapyear {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int n=Sc.nextInt();
        if (n%4==0){ 
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not leap year");
        }
    }
    
}
