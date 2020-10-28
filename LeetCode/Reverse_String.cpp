//! 344. Reverse String(LeetCode)

// Write a function that reverses a string. The input string is given as an array of characters char[].

// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// You may assume all the characters consist of printable ascii characters.

// Example 1:

// Input: ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

class Solution
{
public:
    void reverseString(vector<char> &A)
    {
        /* stack */
        //         stack<char> st;
        //         //pushing char
        //         for(int i=0; i<A.size(); i++){
        //             st.push(A[i]);
        //         }

        //         //poping char
        //         for(int i=0; i<A.size();i++){
        //             A[i] = st.top();
        //             st.pop();
        //         }
        /* swipping */
        int s = 0;            //start
        int e = A.size() - 1; //end
        while (s <= e)
        {
            swap(A[s], A[e]);
            s++;
            e--;
        }
    }
};