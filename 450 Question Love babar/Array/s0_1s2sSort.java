package Array;

import java.util.Arrays;

/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in
 * ascending order.
 * 
 * 
 * Example 1:
 * 
 * Input: N = 5 arr[]= {0 2 1 2 0} 
 * Output: 0 0 1 2 2 Explanation: 0s 1s and 2s
 * are segregated into ascending order.
 */
public class s0_1s2sSort {

    public static void main(String[] args) {
        int[] arr = {0 ,2 ,1 ,2 ,0};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
