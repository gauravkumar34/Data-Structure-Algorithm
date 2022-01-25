import java.util.Arrays;

/**
 * {{slidingWindow}}
 * In many problems dealing with an array (or a LinkedList), we are asked to
 * find or calculate something among all the contiguous subarrays (or sublists)
 * of a given size. For example, take a look at this problem:
 * 
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in
 * it.
 * 
 * Let’s understand this problem with a real input:
 * 
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Here, we are asked to find the average of all contiguous subarrays of size
 * ‘5’ in the given array. Let’s solve this:
 * 
 * For the first 5 numbers (subarray from index 0-4), the average is:
 * (1+3+2+6-1)/5 => 2.2(1+3+2+6−1)/5=>2.2
 * The average of next 5 numbers (subarray from index 1-5) is: (3+2+6-1+4)/5 =>
 * 2.8(3+2+6−1+4)/5=>2.8
 * For the next 5 numbers (subarray from index 2-6), the average is:
 * (2+6-1+4+1)/5 => 2.4(2+6−1+4+1)/5=>2.4
 * …
 * Here is the final output containing the averages of all contiguous subarrays
 * of size 5:
 * 
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */
public class slidingWindow {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        int k = 5;
        double[] ans_1 = bruteForce(arr, k);
        double[] ans_2 = preFixsum(arr, k);
        System.out.println(Arrays.toString(ans_1));
        System.out.println(Arrays.toString(ans_2));
    }

    /**
     * A brute-force algorithm
     * Time complexity: O(N*K)
     */

    public static double[] bruteForce(int[] arr, int k) {

        double[] ans = new double[arr.length - k + 1];
        for (int i = 0; i < arr.length - k + 1; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            ans[i] = sum / k;
        }
        return ans;
    }

    /**
     * Prefix Sum
     * Time complexity: O(N)
     */

    public static double[] preFixsum(int[] arr, int k) {

        double[] ans = new double[arr.length - k + 1];
        int windowStart = 0;
        double sum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            sum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                ans[windowStart] = sum / k;
                sum -= arr[windowStart];
                windowStart++;
            }

        }

        return ans;

    }
}