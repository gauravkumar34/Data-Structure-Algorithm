//! https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0 && needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;

        char c = needle.charAt(0);
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i < h - n + 1; i++) {
            if (haystack.charAt(i) == c) {
                String s = haystack.substring(i, i + n);
                if (s.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
