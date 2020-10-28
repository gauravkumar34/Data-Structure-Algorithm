//!14. Longest Common Prefix
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

0 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters. */

class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        // string ans = "";
        // if(strs.size() == 0) return ans;
        // string s = *min_element(strs.begin(),strs.end()); //min element_string from vector
        // for(int i=0; i<s.size(); i++){
        //     for(int j=0; j<strs.size(); j++){
        //         if(s[i] != strs[j][i]){
        //             return ans;
        //         }
        //     }
        //     ans.push_back(s[i]);
        // }
        // return ans;

        string ans = "";
        if (strs.size() == 0)
            return ans;
        string s = strs[0]; //first string== min_element
        for (int i = 0; i < s.size(); i++)
        {
            for (int j = 1; j < strs.size(); j++)
            {
                if (i >= strs[j].size() || s[i] != strs[j][i])
                {
                    return ans;
                }
            }
            ans.push_back(s[i]);
        }
        return ans;
    }
};