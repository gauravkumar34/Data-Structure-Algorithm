package Array;

import java.util.Arrays;

/**
 * 5.Move all negative numbers to beginning and positive to end with constant
 * extra space. Input: -12, 11, -13, -5, 6, -7, 5, -3, -6 
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 * Note: Order of elements is not important here.
 */
public class moveNgPo {
    public static void main(String[] args) {
        int[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
