//!Reverse the array
#include<bits/stdc++.h>
typedef long long ll;
using namespace std;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n,i=0;
	    
	    cin>>n;
	    int a[n];
	    for(int i=0; i<n;i++){
	        cin>>a[i];
	    }
	    int temp=0,s=n-1;
	    while(i<s){
	       temp = a[i];
	       a[i] = a[s];
	       a[s] =temp;
	        i++;
	        s--;
	    }
	    for (int i=0; i<n ;i++){
	        cout<<a[i]<<" ";
	    }
	    
	}
	return 0;
}
