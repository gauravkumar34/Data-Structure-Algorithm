import java.util.HashSet;
import java.util.Set;

public class intersectionTwoArr {
    public static void main(String[] args) {
        int[] a = {5,10,15,5,4};
        int[] b = {10,15,7,9,7,4};
        Set<Integer> ans = intersection(a,b);
        System.out.println(ans);
    }
    public static Set<Integer> intersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            if(set.contains(i)){
                set1.add(i);
                // break;
            }
            // set.add(i);
        }
        return set1;
    }
}
