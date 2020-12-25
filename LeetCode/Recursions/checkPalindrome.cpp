#include <bits/stdc++.h>
using namespace std;

bool checkPal(int a[], int s, int e)
{
    if (s > e)
        return true;
    if (a[s] == a[e])
        return checkPal(a, s + 1, e - 1);
    else
        return false;
}

int main()
{
    int a[] = {1, 2, 3, 3, 2, 1};
    cout << checkPal(a, 0, 5);
    return 0;
}