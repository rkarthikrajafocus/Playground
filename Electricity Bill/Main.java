#include<iostream>
using namespace std;
int main()
{
int a;
cin>>a;
if(a<=200)
  cout<<"Rs." <<int(0.5*a);
else if (a<=400)
  cout<<"Rs." <<int(0.65*a+100);
else if (a<=600)
  cout<<"Rs." <<int(0.8*a+200);
else
  cout<<"Rs." <<int(1.25*a+425);         
  }