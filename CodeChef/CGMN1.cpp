//!https://www.codechef.com/problems/CGMN1

#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    // your code goes here
    int t;
    t = 1;
    while (t--)
    {
        ll n, m;
        cin >> n >> m;
        ll first = 1, last = n;
        ll sum;
        if (n % 2 == 0)
        {
            sum = n / 2;
            sum *= (n + 1);
        }
        else
        {
            sum = (n + 1) / 2;
            sum *= n;
        }
        for (int i = 0; i < m; i++)
        {
            ll num;
            cin >> num;
            if ((num >= 2 && num <= n - 1) || num == first || num == last)
            {
                ll temp = first;
                first = last;
                last = temp;
            }
            else
            {
                sum = sum - last + num;
                last = num;
            }
            cout << sum << "\n";
        }
    }
    return 0;
}