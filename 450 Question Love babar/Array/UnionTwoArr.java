package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 6. UnionTwoArr Input: 5 3 1 2 3 4 5 1 2 3 Output: 5 Explanation: 1, 2, 3, 4
 * and 5 are the elements which comes in the union set of both arrays. So count
 * is 5.
 */
public class UnionTwoArr {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 5, 6 };

        int union = doUnion(a, a.length, b, b.length);
        int intersection = doIntersection(a, a.length, b, b.length);
        System.out.println("Union " + union);
        System.out.println("Intersection " + intersection);
    }

    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here
        // Your code here
        Set<Integer> ans = new HashSet<>();
        for (int i : a) {
            ans.add(i);
        }
        for (int j : b) {
            ans.add(j);
        }
        return ans.size();
    }

    public static int doIntersection(int a[], int n, int b[], int m) {
        Set<Integer> ans = new HashSet<>();
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    ans.add(j);
                }
                // ans.add(i);
            }
        }
        return ans.size();
    }
}