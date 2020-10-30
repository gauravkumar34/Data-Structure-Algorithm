//!Unsorted Array
#include <bits/stdc++.h>
using namespace std;

int removeDublicate(vector<int> A)
{
    sort(A.begin(), A.end());
    if (A.size() < 2)
        return A.size();
    int i = 0;
    int j = 1;
    while (j < A.size())
    {
        if (A[j] != A[i])
        {
            i++;
            A[i] = A[j];
        }
        j++;
    }
    return i + 1;
}

int main()
{
    // your code goes here
    int n, l;
    cin >> n;
    vector<int> A;
    for (int i = 0; i < n; i++)
    {
        cin >> l;
        A.push_back(l);
    }
    cout << removeDublicate(A);
    return 0;
}
