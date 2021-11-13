package recursion;
public class sumDigits {
    
    public static void main(String[] args) {
        int n = 9987;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n<10) return n;
        return sum(n/10) + n%10 ;
    }
}
