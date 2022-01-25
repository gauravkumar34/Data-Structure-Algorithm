public class slidingWindow {
    /***
     * Find maximum in sliding window
     * @param args
    */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 77, 3, 1, 4, 5, 7 };
        int k = 3;
        int ans = getPrefixSum(arr, k);
        System.out.println(ans);
    }

    public static int getPrefixSum(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (i == arr.length - k + 1)
                break;
            for (int j = i; j < k + i; j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

}
