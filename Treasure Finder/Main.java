#include<iostream>
#include<algorithm>

using namespace std;
int main()
{
int a,b,c;
cin>>a>>b>>c;

cin>>a>>b>>c;
if (a<b && a>c || a>b && a<c)
  cout<<"The treasure is in box which has number "<<a<<endl;
if (b<a && b>c || b>a && b<c)
  cout<<"The treasure is in box which has number "<<b<<endl;
if (c<b && c>a || c>b && c<a)
  cout<<"The treasure is in box which has number "<<c<<endl;
cout<<"The code to open the box is "<<__gcd(__gcd(a,b),c);
  
}