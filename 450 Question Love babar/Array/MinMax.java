package Array;

/**
 * 2.Write a C function to return minimum and maximum in an array. Your program
 * should make the minimum number of comparisons.
 */
public class MinMax {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMixMax(int[] arr) {

        Pair minmax = new Pair();

        if (arr.length == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]) {
            minmax.min = arr[1];
            minmax.max = arr[0];
        } else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2 };
        Pair minmax = getMixMax(arr);
        System.out.println("Min " + minmax.min);
        System.out.println("Max " + minmax.max);
    }
}
