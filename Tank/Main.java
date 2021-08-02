#include<iostream>
using namespace std;

int main()
{
int r,h,w,hours;
cin>>r>>h>>w>>hours;
if(r*r*h*22/7<=w*hours)
  cout<< "The tank can be filled within " << hours << " hours" ;
else
  cout<<"The tank cannot be filled within "<<hours<<" hours";

}