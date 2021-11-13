package geekforgeekDSA.recursion;
public class jorepheerProblem {
    public static void main(String[] args) {
        int n=7;
        int k=3;
        int ans =jor(n, k);
        System.out.println(ans);
    }
    static int jor(int n, int k){
        if(n==1) return n;
        return (jor(n-1, k) + k-1) % n+1;

    }
}
