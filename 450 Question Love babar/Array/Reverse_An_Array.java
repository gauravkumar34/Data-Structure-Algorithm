package Array;

/**
 * 1.Write a program to reverse an array or string? 
 * Input : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 * 
 * Input : arr[] = {4, 5, 1, 2} 
 * Output : arr[] = {2, 1, 5, 4}
 */
public class Reverse_An_Array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int start = 0; int end = arr.length-1;
        reverArr(arr, start, end);
        recurRevArr(arr, start, end);
        printArr(arr);
    }

    public static void reverArr(int[] arr,int start,int end) {
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void recurRevArr(int[] arr, int start,int end) {
        int temp;

        while(start>=end) return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recurRevArr(arr, start+1, end-1);
        
    }

}