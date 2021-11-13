package geekforgeekDSA.recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String str= "geeks";
		System.out.println(isPal(str,0,3));
	}
	
	public static boolean isPal(String str, int s, int e){
	    if(s==e) return true;
	    if(s>e) return true;
	    if(str.charAt(s) != str.charAt(e)) return false;
	    return isPal(str, s+1, e-1);
	}
}
