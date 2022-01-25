public class subSetString {
    public static void main(String[] args) {
        String input = "abc";
        subSetStringPrint(input, "", 0);
    }

    public static void subSetStringPrint(String input, String crr, int index) {
        
        if( index == input.length()) 
        {
            System.out.print(crr +" ");
            return;
        }
        subSetStringPrint(input, crr, index+1);
        subSetStringPrint(input, crr + input.charAt(index), index+1);
        
    }
}
