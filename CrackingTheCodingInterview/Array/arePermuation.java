import java.util.Arrays;

/**
 * arePermuation //* time Complextity of this method is (nlogn + n^2) because
 * *Array.Sort use TimSort i.e is insertion and merge sort
 */
public class arePermuation {

    public static String sortString(String s) {

        char[] word = s.toCharArray();
        Arrays.sort(word);
        return new String(word);
    }

    public static boolean arePermuation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        return sortString(s1).equals(sortString(s2));
    }

    public static void main(String[] args) {
        String s1 = "bdcaee";
        String s2 = "abcddd";
        System.out.println(arePermuation(s1, s2));

    }
}