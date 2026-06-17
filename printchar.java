import java.util.Scanner;
public class printchar {
 public static void main(String[] args) {
    char ch;
    System.out.println("Enter your Character");
    Scanner sc=new Scanner(System.in);
     ch= sc.next().charAt(5);
    System.out.println(ch);
 }  
}
