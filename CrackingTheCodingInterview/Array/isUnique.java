import java.util.Scanner;

/**
 * isUnique
 */
public class isUnique {

    public static boolean isUniqueChar(String s) {

        if (s.length() > 128)
            return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (charSet[val])
                return false;
            charSet[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        boolean ans = isUniqueChar(s);
        System.out.println(ans);
    }
}