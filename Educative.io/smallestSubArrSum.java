import java.util.Arrays;

/**
 * Given an array of positive numbers and a positive number ‘S’, find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’. Return 0, if no such subarray exists.
 * 
 * Example 1:
 * 
 * Input: [2, 1, 5, 2, 3, 2], S=7
 * Output: 2
 * Explanation: The smallest subarray with a sum great than or equal to '7' is
 * [5, 2].
 * Example 2:
 * 
 * Input: [2, 1, 5, 2, 8], S=7
 * Output: 1
 * Explanation: The smallest subarray with a sum greater than or equal to '7' is
 * [8].
 * Example 3:
 * 
 * Input: [3, 4, 1, 1, 6], S=8
 * Output: 3
 * Explanation: Smallest subarrays with a sum greater than or equal to '8' are
 * [3, 4, 1] or [1, 1, 6].
 */
public class smallestSubArrSum {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 2, 8 };
        int k = 7;
        int ans_2 = preFixsum(arr, k);
        System.out.println(ans_2);
    }

    private static int preFixsum(int[] arr, int k) {
        int sum = 0;
        int startIndex = 0, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= k) {
                minLength = Math.min(minLength, i - startIndex + 1);
                sum -= arr[startIndex];
                startIndex++;
            }

        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
