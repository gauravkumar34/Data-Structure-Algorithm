//!https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/mojtaba-prepares-contest-29b2a044/description/
#include<bits/stdc++.h>

using namespace std ;

int main(){
    int t;
    cin>>t;
    while(t--){
    int gC,pC;
    cin>>gC>>pC;
    int p;
    cin>>p;
    int cP=0,cG=0;
    int ans ;
    for(int i=0; i<p; i++){
    int gP,pP;
        cin>>gP>>pP;
        if(gP == 1 ) cG++;
        if(pP == 1) cP++;
    }
    if(gC>=pC && cG<=cP){
    ans=(cP*pC)+(cG*gC);}
    
    else if (gC<pC && cG>cP){ ans = (pC*cP)+(gC*cG);}
     else{
    ans=(cG*pC)+(cP*gC);
        
    }
    cout<<ans<<endl;

    }
    

}