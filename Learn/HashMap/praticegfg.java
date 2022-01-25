
import java.util.Scanner;

/**
 * praticegfg
 */
public class praticegfg {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int input = 522;
        String input2 = "aabbaa";
        int k = 1;
        int s = 0;
        int e = input2.length() - 1;
        // fact(input,k);
        int ans = factTail(input, k);
        // System.out.println(s+ " "+e);
        System.out.println(revSum(input));
    }

    // loop number from 1 to n
    public static void fact(int n, int k) {
        if (n < 1)
            return;
        // fact(n-1);
        System.out.println(k);
        // return
        fact(n - 1, k + 1);

    }

    // factorial of number with tail recursive
    public static int factTail(int n, int k) {
        if (n < 1)
            return k;
        return factTail(n - 1, n * k);
    }

    // check palindrome
    public static boolean palindrome(String input2, int s, int e) {
        if (s == e)
            return true;
        if (s > e)
            return true;

        if (input2.charAt(s) != input2.charAt(e)) {
            return false;
        }
        return palindrome(input2, s + 1, e - 1);

    }
    //sum of  Problem

    public static int revSum(int n) {
        if(n<10) return n;
        return revSum(n/10) +n%10; 
    }
}