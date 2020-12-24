/**
 * checkArraySorted
 */
public class checkArraySorted {

    static boolean isSorted(int[] a, int n) {
        if (n == 0 || n == 1)
            return true;
        if (a[n - 1] < a[n - 2])
            return false;
        return isSorted(a, n - 1);

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 11 };
        int n = a.length;
        if (isSorted(a, n) == true) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}