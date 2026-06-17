import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
         
        if(n%2==0){
        for(int i=0;i<=n;i=i+2) {
         sum= sum+i;
    }
    System.out.println("sum of Even number" + sum);
}
    else{ 
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println("sum of Odd number" + sum);

    }

    }
} 
