#include<iostream>
#include<string.h>
using namespace std;

int main()
{
int x,y,z,a,r;
cin>>x>>y>>z>>a;
r=0;  
if(x>=a)
  r++;
if(y>=a)
  r++;
if(z>=a)
  r++;
cout<<r;  
}