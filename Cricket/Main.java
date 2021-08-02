#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
float a,b,c,d;
cin>>a>>b>>c>>d;
cout<<a/6<<endl;
cout<<(int(d)%6)*0.1+int(d)/6<<endl;
cout<<fixed<<setprecision(1)<<c/((int(d)%6)*0.1+int(d)/6)<<endl;
cout<<fixed<<setprecision(1)<<b/((int(a)%6)*0.1+int(a)/6)<<endl;
if(c/((int(d)%6)*0.1+int(d)/6)>=b/((int(a)%6)*0.1+int(a)/6))
  cout<<"Eligible to Win";
else
  cout<<"Not Eligible to Win";
}