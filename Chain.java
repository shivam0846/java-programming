import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount = 5000;
        String parent = sc.nextLine();
        String ch = sc.nextLine();
        String[] child = {};

        if (ch.equals("Y")) {
            child = sc.nextLine().split(",");
        }
        System.out.println("TOTAL MEMBERS:" + (child.length + 1));
        System.out.println("COMISSION DETAILS");
        
        System.out.println(parent + ": " + (child.length > 0 ?
                child.length * 500 : 250) + " INR");
        for (String c : child) {
            System.out.println(c.trim() + ": 250 INR");
        }
    }
}