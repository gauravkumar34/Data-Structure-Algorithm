package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 7. Cyclically rotate an array by one 
 * N = 5 
 * A[] = {1, 2, 3, 4, 5} 
 * Output: 5 1 2 3 4
 */
public class cyclicRotateByOne {
 public static void main(String[] args) {
     int a[] = {1, 2, 3, 4, 5};
    List<Integer> ans = new ArrayList<>();
     int temp, temp2;
     ans.add(a[a.length -1]);
    //  System.out.print(temp);
     for (int i = 0; i < a.length-1; i++) {
        ans.add(a[i]);
     }
     Integer[] arr = new Integer[ans.size()];
  
        // ArrayList to Array Conversion
        for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);
  
     for (Integer integer : arr) {
         System.out.print(integer+" ");
     }
     
 }

}
