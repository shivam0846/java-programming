public class catchblock {
    public static void main(String[] args) {
        try{
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print ststement in try block");
        }
        catch(ArithmeticException e){
            System.out.println("Warning:Arthimetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning:ArrayindexoutofboundsException");
        }
    }
    
}
