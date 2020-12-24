public class checkElementPresent {
    public static boolean isPresent(int[] arr, int n, int x) {
        if (n == 0)
            return false;
        if (arr[n - 1] == x)
            return true;

        boolean smallP = isPresent(arr, n - 1, x);
        return smallP;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int x = 7;
        System.out.println(isPresent(arr, n, x));
    }
}
