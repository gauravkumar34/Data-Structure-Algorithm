import java.util.HashSet;
import java.util.Set;

/**
 * countDistinctElement
 */
public class countDistinctEle {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,4,6,7,8};
        int ans = countDistinctElem(arr);
        System.out.println(ans);
    }

    public static int countDistinctElem(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int integer : arr) {
            set.add(integer);
        }
        return set.size();
    }

    
}