import java.util.HashMap;

/**
 * find the sub Array with given Sum;
 */
public class kSumArray {
    
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,9,3};
        int sum = 10;
        sum(arr,sum);
        // System.out.println(ans);
    }
    public static void sum(int[] arr,int sum) {
        int curSum=0;
        int start =0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if(curSum - sum ==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(curSum - sum)){
                start = map.get(curSum - sum) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        if(end == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println(start+ " "+ end);
        }
        
    }
}
