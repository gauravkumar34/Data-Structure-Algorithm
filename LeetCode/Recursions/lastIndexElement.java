public class lastIndexElement {
    // ! with i end to start
    public static int lastIndex(int[] a, int n, int x, int i) {
        if (i == -1)
            return -1;
        if (a[i] == x)
            return i;

        return lastIndex(a, n, x, i - 1);
    }

    // !without i end to start
    public static int lastIndex2(int[] a, int n, int x) {
        if (n == 0)
            return -1;
        if (a[n - 1] == x)
            return n - 1;

        return lastIndex2(a, n - 1, x);
    }

    // ! start to end
    public static int lastIndex3(int[] a, int n, int x, int i) {
        if (i == n)
            return -1;
        int indexInRem = lastIndex3(a, n, x, i + 1);
        if (indexInRem == -1) {
            if (a[i] == x)
                return i;
            else {
                return -1;
            }
        } else {
            return indexInRem;
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 6, 1, 4, 6, 7 };
        int n = a.length;
        int x = 6;
        System.out.println(lastIndex(a, n, x, n - 1));
        System.out.println(lastIndex2(a, n, x));
        System.out.println(lastIndex3(a, n, x, 0));
    }
}
