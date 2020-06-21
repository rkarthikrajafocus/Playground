#include<iostream>
using namespace std;
int main()
{
int a,b,c;
cin>>a>>b>>c;
if (a<b && a<c)
  cout<<"L1";
if (b<a && b<c)
  cout<<"L2";
if (c<b && c<a)
  cout<<"L3";
}