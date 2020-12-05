
#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

void PrintStack(stack<int> s)
{
    if (s.empty())
        return;
 
    int x = s.top();
 
    s.pop();
 
    cout << x << ' ';

    PrintStack(s);
    s.push(x);
}
int main() {
	int arr[] = {8,6,5,5,9,3,6,4,1}; //array of your choise
	int n = sizeof(arr) / sizeof(arr[0]);;
	sort(arr, arr + n);
	stack<int> st;
	for(int i=0; i<n;i++){
	    if(st.empty()){
	        st.push(arr[i]);
	    } else if(arr[i]!=st.top()){
	        st.push(arr[i]);
	    }
	    else{
	        st.pop();
	    }
	}
	 PrintStack(st);
	
	
	return 0;
}
