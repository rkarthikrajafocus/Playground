#include<iostream>
using namespace std;
int main()
{
int r,c,t;
cin>>r>>c>>t;
if(t<=r || t>(c-1)*r || t%r==1)
  cout<<"Yes";
else
  cout<<"No";
}