public class printAllPosition {
    public static void printPosition(int a[], int n, int x, int i) {
        if (i == n)
            return;
        if (a[i] == x) {
            System.out.println(i);
        }
        printPosition(a, n, x, i + 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 3, 4, 5, 7 };
        int n = a.length;
        int x = 4;
        int i = 0;
        printPosition(a, n, x, i);
    }
}
