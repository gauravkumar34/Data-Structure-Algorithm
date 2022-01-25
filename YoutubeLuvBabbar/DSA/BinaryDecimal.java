import java.util.Scanner;

/**
 * BinaryDecimal
 */
public class BinaryDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  number = sc.nextInt();
        binaryToDecimal(number);
        // decimalToBinary(number);
    }

    public static void binaryToDecimal(int n) {
        int ans=0;
        int i=0;
        while(n!=0){
            int bit = n&1;
            ans = (bit * (int)Math.pow(10,i)) + ans;
            n = n >> 1;
            i++;
        }
        System.out.println("Binary to decimal "+ans);
        
    }
    public static void decimalToBinary(int n) {
        int ans =0;
        int i=0;
        while(n!=0){
            int bit = n%10;

            if(bit == 1){
                ans = ans + (int)Math.pow(2,i);
            }
            n = n/10;
            i++;
        }
        System.out.println("Decimal To Binary  "+ans);

        
    }
}