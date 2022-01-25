import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :- ");
        int n  = sc.nextInt();
        Boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                // rem =0
                // System.out.println("Not a prime number.");
                isPrime = false;
                break;
            } 
            
        }
        if(isPrime == false){
            System.out.println("Not a prime number.");
        }
        else {
            System.out.println("Prime number.");
        }
    }
}
