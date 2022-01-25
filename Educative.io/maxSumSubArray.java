import java.util.Arrays;

/**
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 */
public class maxSumSubArray {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        int ans_1 = bruteForce(arr, k);
        int ans_2 = preFixsum(arr, k);
        System.out.println(ans_1);
        System.out.println(ans_2);

    }

    /**
     * A brute-force algorithm
     * Time complexity: O(N*K)
     */
    private static int bruteForce(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    /**
     * Prefix Sum
     * Time complexity: O(N)
     */
    private static int preFixsum(int[] arr, int k) {
        int sum=0;
        int index=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(i >= k -1 ){
                max = Math.max(sum, max);
                sum -= arr[index];
                index++;
            }
        }

        return max;
    }

}
