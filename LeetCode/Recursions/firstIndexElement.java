public class firstIndexElement {

    public static int findIndex(int[] a, int n, int x, int i) {
        if (i == n)
            return -1;
        if (a[i] == x)
            return i;
        return findIndex(a, n - 1, x, i + 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 9, 1, 6, 2, 9 };
        int n = a.length;
        int x = 9;
        int i = 0;
        int ans = findIndex(a, n, x, i);
        System.out.println(ans);
    }
}
