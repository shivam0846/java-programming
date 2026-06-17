public class CatchNumberFormate {

    public static boolean isValid(String ip) {
        return true;
    }
    public static void main(String[] args) {
        String ip1 = "222.111.111.111";
        String ip2 = "256.100.50.25";
        String ip3 = "192.168.1.o1";
        String ip4 = "10.0.0.1";

        System.out.println(isValid(ip1));
        System.out.println(isValid(ip2));
        System.out.println(isValid(ip3));
        System.out.println(isValid(ip4));
    }
}
