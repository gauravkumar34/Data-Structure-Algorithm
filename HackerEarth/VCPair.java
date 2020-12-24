import java.util.Scanner;

//!https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/vc-pairs/description/
/**
 * VCPair
 */
public class VCPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int t0 = 0; t0 < t; t0++) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] str = new char[n];
            str = s.toCharArray();
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                // if (n == 1)
                // System.out.println(0);
                // else {
                if ((str[i] != 'a') && (str[i] != 'e') && (str[i] != 'i') && (str[i] != 'o') && (str[i] != 'u')
                        && ((str[i + 1] == 'a') || (str[i + 1] == 'e') || (str[i + 1] == 'i') || (str[i + 1] == 'o')
                                || (str[i + 1] == 'u'))) {
                    count++;
                }

                // }
            }
            System.out.println(count);
        }
    }
}