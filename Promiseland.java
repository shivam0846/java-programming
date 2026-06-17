import java.util.*;
public class Promiseland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            int s = sc.nextInt();

            int[] r = new int[x];
            int[] c = new int[y];

            for (int i = 0; i < x; i++) {
                r[i] = sc.nextInt();
            }
            for (int i = 0; i < y; i++) {
                c[i] = sc.nextInt();
            }
            Arrays.sort(r);
            Arrays.sort(c);
            long rows = 0;
            long cols = 0;

            int last = 0;

            for (int i = 0; i < x; i++) {
                rows += (r[i] - last - 1) / s;
                last = r[i];
            }
            rows += (n - last) / s;

            last = 0;

            for (int i = 0; i < y; i++) {
                cols += (c[i] - last - 1) / s;
                last = c[i];
            }
            cols += (m - last) / s;

            System.out.println(rows * cols);
        }
    }
}
    

