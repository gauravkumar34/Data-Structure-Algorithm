import java.util.*;

public class Kadane {
    // Given an integer array nums, find the contiguous subarray (containing at
    // least one number) which has the largest sum and return its sum.
    // A subarray is a contiguous part of an array.
    // -2,1,-3,4,-1,2,1,-5,4
    // 5, 4, -1, 7, 8
    public static void main(String[] args) {
        int[] arr = { -2,1,-3,4,-1,2,1,-5,4 };
        // Max sum of subArray
        int sumMaxSubArray = sumSubArray(arr);
        // Length of the max subarray
        int lengthMaxSubArray = lengthSubArray(arr);
        System.out.println(sumMaxSubArray);
    }

    public static int sumSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // [4,-1,2,1]
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static int lengthSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0, max = Integer.MIN_VALUE, count = 0;
        ArrayList<Integer> maps = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // [4,-1,2,1]

            System.out.println(sum + " " + max);
                max = Math.max(sum, max);
                maps.add(i);
                // fI = i;
            if (sum < 0)
                sum = 0;

        }
        for (int ns : maps) {
            
            System.out.print(ns+ " ");
        }
        return count;
    }
}
