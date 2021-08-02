#include<iostream>

using namespace std;

int main()

{

int r,c,t;

cin>>r>>c>>t;

if((t>r && t<=(2*r))||(t<=(r*(r-1)) &&t>(r*(r-2))))
  cout<<"It is an orange tree";

else
  cout<<"It is not an orange tree";
}
