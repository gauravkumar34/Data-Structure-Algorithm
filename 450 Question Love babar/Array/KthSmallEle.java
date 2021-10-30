package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 3.Given an array arr[] and an integer K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array. It is given
 * that all array elements are distinct. Input: N = 6 arr[] = 7 10 4 3 20 15 K = 3 
 * Output : 7 Explanation : 3rd smallest element in the given array is 7.
 */
public class KthSmallEle {

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int[] ans = sort(arr);
        System.out.println(sorted(arr));
        System.out.println(ans[2]);

    }

    static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    static int sorted(int[] arr) {
        ArrayList<Integer> arrs = new ArrayList<>();
        for (Integer integer : arr) {
            arrs.add(integer);
        }
        Collections.sort(arrs);
        return arrs.get(2);
    }
}

/**
 * TIPS 
 * Arrays.sort(Object[]) is based on the TimSort algorithm, giving us a
 * time complexity of O(n log(n)). Collections.sort() converts the list into an
 * array and calls Arrays.sort()
 */