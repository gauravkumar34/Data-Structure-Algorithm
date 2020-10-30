//!https://leetcode.com/problems/majority-element/

class Solution
{
public:
    int majorityElement(vector<int> &A)
    {
        //! Moore's voting approach
        int card = A[0];
        int count = 1;
        for (int i = 1; i < A.size(); i++)
        {
            if (A[i] == card)
            {
                count++;
            }
            else
            {
                count--;
                if (count == 0)
                {
                    card = A[i];
                    count = 1;
                }
            }
        }
        return card;
    }
};