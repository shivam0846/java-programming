class Palidrom{
    public static void main(String[] args) {
        int n=121;
        int x,s=0,a=n;
        while (n!=0) 
        {
           x=n%10; //121%10=1,2,1
           
          s=s*10+x; //0*10+1=1,12,121
          n=n/10; //121/10=12,1,0

        }
        System.out.println(s);
        if (a==s)
        {
            System.out.println("palidrom");
        }
        else
        {
            System.out.println("not");
        }
    }
}
