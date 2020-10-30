//! https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution
{
public:
    int removeDuplicates(vector<int> &vec)
    {
        if (vec.size() < 2)
            return vec.size();
        int i = 1;
        int j = 0;
        while (i < vec.size())
        {
            if (vec[i] != vec[j])
            {
                j++;
                vec[j] = vec[i];
            }
            i++;
        }
        return j + 1;
    }
};