public class fibonacci {
    public static void main(String[] args) {
        // System.out.println(fibo(10));
        fibPrint(10);
    }
    public static int fibo(int n) {
        int a1 =0, a2=1;
        int sum=a1+a2;
        for (int i = 2; i < n; i++) {
         sum +=i   ;
        }
        return sum;
    }
    public static void fibPrint(int n) {
        int a1 =0, a2=1;
        System.out.println(a1);
        System.out.println(a2);
        for (int i = 1; i < n; i++) {

            int nextTerm = a1+a2;
            System.out.println(nextTerm);
            a1=a2;
            a2 = nextTerm ;
            
        }
        
    }
}
