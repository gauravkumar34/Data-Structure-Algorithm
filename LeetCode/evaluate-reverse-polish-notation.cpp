//! https://leetcode.com/problems/evaluate-reverse-polish-notation/

class Solution
{
public:
    int evalRPN(vector<string> &A)
    {
        stack<int> st;
        for (int i = 0; i < A.size(); i++)
        {
            //if => oprator perform operation
            if (A[i] == "+" || A[i] == "-" || A[i] == "*" || A[i] == "/")
            {
                int v1 = st.top();
                st.pop();
                int v2 = st.top();
                st.pop();
                if (A[i] == "+")
                {
                    st.push(v1 + v2);
                }
                else if (A[i] == "-")
                {
                    st.push(v2 - v1);
                }
                else if (A[i] == "*")
                {
                    st.push(v1 * v2);
                }
                else if (A[i] == "/")
                {
                    st.push(v2 / v1);
                }
            }
            //if operand then simply push the element
            else
            {
                st.push(atoi(A[i].c_str()));
            }
        }
        return st.top();
    }
};