/**
 * URLify
 */
public class URLify {

    /**
     * 1. In this method First I had run through the char str and Count the Spaces
     * between them via spaceCount 2. So with index variable We put twice of
     * spaceCount and truelen that len of string 3. Now with from reverse forLoop
     * if(found == ' ') then replace with "%20" else decrease index-- and replace
     * element
     * 
     * @param str
     * @param trueLen
     */
    static void replaceSpaces(char[] str, int trueLen) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLen; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }
        index = trueLen + (spaceCount * 2);
        if (trueLen < str.length)
            str[trueLen] = '\0'; // ending array in case of excess array
        for (i = trueLen - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        System.out.println(str);

    }

    public static void main(String[] args) {
        String s = "Mr John Smith    "; // len of whole string is 17
        int trueLen = 13;
        char[] str = s.toCharArray();
        System.out.println(str);
        replaceSpaces(str, trueLen);

    }
}