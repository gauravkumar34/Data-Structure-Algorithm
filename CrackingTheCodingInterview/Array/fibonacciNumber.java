import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static List<Integer>  fib(int n) {
        int n0=0,n1=1,n2;
        List<Integer> arr = new ArrayList<>();
        arr.add(n0);
        arr.add(n1);
        for (int i = 2; i < n; i++) {
            n2 = n1+n0;
            arr.add(n2);
            n0=n1;
            n1=n2;
        }
        return arr;
    }
}
