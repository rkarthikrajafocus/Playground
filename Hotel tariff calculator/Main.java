#include<iostream>
using namespace std;
int main()
{
int m,r,n;
cin>>m>>r>>n;
if(m>12 ||m<1)
  cout<<"Invalid Input";
else if(m==4 ||m==5||m==6||m==1||m==12)
  cout<<1.2*r*n;
else
  cout<<r*n;
  }