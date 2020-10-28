// !58. Length of Last Word
// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

// If the last word does not exist, return 0.

// Note: A word is defined as a maximal substring consisting of non-space characters only.

// Example:

// Input: "Hello World"
// Output: 5

class Solution
{
public:
    int lengthOfLastWord(string s)
    {
        int n = s.size();
        int i = 0;
        int count = 0;

        while (i < n)
        {
            if (s[i] != ' ')
            {
                count++;
                i++;
            }
            else
            {
                while (i < n && s[i] == ' ')
                    i++;

                if (i == n)
                    return count;
                else
                {
                    count = 0;
                }
            }
        }
        return count;
    }
};