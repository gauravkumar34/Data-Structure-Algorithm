//! 344. Reverse String(LeetCode)
//! https://leetcode.com/problems/reverse-string/
// Example 1:

// *Input: ["h","e","l","l","o"]
// *Output: ["o","l","l","e","h"]
// Example 2:

// *Input: ["H","a","n","n","a","h"]
// *Output: ["h","a","n","n","a","H"]

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