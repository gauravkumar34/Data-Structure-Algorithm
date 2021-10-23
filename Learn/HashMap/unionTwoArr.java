import java.util.HashSet;
import java.util.Set;

public class unionTwoArr {
    public static void main(String[] args) {
        int[] a = {5,10,15,5};
        int[] b = {10,15,4};
        Set<Integer> ans = union(a,b);
        System.out.println(ans);
    }

    public static Set<Integer>  union(int[] a ,int[] b) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer1 : a) {
            set.add(integer1);
        }
        for (Integer integer2 : b) {
            set.add(integer2);            
        }
        return set;
    }
}
