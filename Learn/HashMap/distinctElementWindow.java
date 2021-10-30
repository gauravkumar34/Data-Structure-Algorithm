import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Count the distinct element in every window of size k
 */
public class distinctElementWindow {

    public static void main(String[] args) {
        int[] a= {1,2,2,1,3,1,1,3};
        int size =4;
        dinWindow(a, size);
    }

    public static void dinWindow(int[] a, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> ans = new HashMap<>();
        for (int i=0; i<k;i++) {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int j=0;
        ans.put(j,ans.getOrDefault(a[0], map.size()));
        for(int i=k;i<a.length;i++){
            if(map.get(a[i-k] )==1){
                map.remove(a[i-k]);
            } 
            else{
                map.put(a[i-k], map.get(a[i-k])-1);
            }
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        // ans.add(map.size());
        j++;
        ans.put(j, ans.getOrDefault(j, map.size()));

        }
        System.out.println(ans.values());
    }
}