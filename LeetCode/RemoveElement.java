//! https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] A, int val) {
        int p1 = 0;
        int arrayLength = A.length;
        for (int p2 = 0; p2 < arrayLength; p2++) {
            if (A[p2] != val) {
                A[p1] = A[p2];
                p1++;
            }
        }
        return p1;
    }
}