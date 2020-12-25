#include <bits/stdc++.h>
using namespace std;

void occ(int a[], int n, int x, int i, int &ans)
{
    if (i == n)
        return;

    if (a[i] == x)
    {
        ans++;
    }
    occ(a, n, x, i + 1, ans);
}
int occ2(int a[], int n, int x, int i)
{
    if (i == n)
        return 0;

    if (a[i] == x)
    {
        return 1 + occ2(a, n, x, i + 1);
    }
    else
    {

        return occ2(a, n, x, i + 1);
    }
}

int main()
{
    int a[] = {1, 4, 3, 4, 5, 7};
    int n = 6;
    int x = 4;
    int i = 0;
    int ans = 0;
    occ(a, n, x, i, ans);
    cout << ans << endl;
    cout << occ2(a, n, x, i);
}
