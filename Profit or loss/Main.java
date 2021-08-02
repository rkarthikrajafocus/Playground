#include<iostream>
using namespace std;
int main()
{
float c,s;
cin>>c>>s;
if(c>12*s)
  cout<<"Loss : Rs."<<int(c-12*s);
else if(12*s>c)
    cout<<"Profit : Rs."<<int(12*s-c);
else
  cout<<"No profit nor loss";
}