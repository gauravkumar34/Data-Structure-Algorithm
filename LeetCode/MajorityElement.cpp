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
        // we can not assure , so we check
        int count2 = 0;
        for (int i = 0; i < A.size(); i++)
        {
            if (A[i] == card)
            {
                count2++;
            }
        }
        if (count2 > A.szie() / 2)
            return card;
        else
            return -1;

        // return card;
    }
};