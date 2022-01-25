public class equilibrimPoint {
    
    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,20,6};
        // int[] arr = {4,-2,2};
        boolean ans = isEquilB(arr);
        System.out.println(ans);
    }
    public static boolean isEquilB(int[] arr) {
        
        int sum_arr =0;

        for (int i = 0; i < arr.length; i++) {
            sum_arr += arr[i];
        }
        System.out.println(sum_arr);
        int l_sum=0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(l_sum == sum_arr - arr[i]) {
                index = i;
                return true;
            }
            l_sum += arr[i];
            sum_arr -=arr[i];
        }
        System.out.println(index);
        return false;
    }
}
