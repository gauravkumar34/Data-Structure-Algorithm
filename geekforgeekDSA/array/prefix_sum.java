/**
 * sliding window
 * 
 * video 3(array)
 */
public class prefix_sum {

    public static void main(String[] args) {
        int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
        int ans = prefixSum(arr, 3, 4);
        System.out.println(ans);
    }

    public static int prefixSum(int[] arr, int l, int r) {

        int preSum[] = new int[arr.length];
        preSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        int getSumAns = getSum(preSum, l, r);
        return getSumAns;
    }

    public static int getSum(int[] preSum, int l, int r) {
        if (l != 0) {
            return preSum[r] - preSum[l - 1];
        }
        return preSum[r];
    }
}