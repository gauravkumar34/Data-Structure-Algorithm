#include <bits/stdc++.h>
using namespace std;

string longestCommonPrefix(vector<string> &strs)
{
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

int main()
{
    // your code goes here
    int n;
    string input;
    std::vector<string> strs;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> input;
        strs.push_back(input);
    }
    cout << longestCommonPrefix(strs);

    return 0;
}
