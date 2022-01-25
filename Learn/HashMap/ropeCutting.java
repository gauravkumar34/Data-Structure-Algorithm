
import java.util.Scanner;

/**
 * recursionProblem
 */
public class ropeCutting {

    
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println(ropeLength(23, 11, 9, 12));
        
    }
    /**
     * rope cutting problem gfg video recursion 3
     * @param n
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int ropeLength(int n, int a, int b, int c) {
        if(n==0) return 0;
        if(n <0 ) return -1;
        int ans = max(
            ropeLength(n-a, a, b, c),
            ropeLength(n-b, a, b, c),
            ropeLength(n-c, a, b, c));
            if(ans  == -1) return -1;
            return ans + 1;
    }

    public static int max(int a , int b, int c) {
        
        if(a >= b && a >= c) return a;
        if(b>=c && b>=a) return b;
        else  return c;
    }
}