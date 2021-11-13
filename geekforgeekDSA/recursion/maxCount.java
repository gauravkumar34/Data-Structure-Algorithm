/**
 * 3rd video recursion
 * time complextity 3^n
 */
public class maxCount {
    public static void main(String[] args) {
        
    int n=23,a=12,b=9,c=11;

    System.out.println(maxC(n,a,b,c));
    }

    static int maxC(int n, int a, int b, int c){
        if(n==0) return 0;
        if(n<-1) return -1;

        int res = max(maxC(n-a,a,b,c),maxC(n-b,a,b,c),maxC(n-c,a,b,c));
        if(res == -1) return -1;
        return res+1;
    }
    static int max(int x, int y, int z)
    {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
}
