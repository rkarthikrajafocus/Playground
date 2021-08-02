#include<iostream>
using namespace std;
int main()
{
int p1,d1,s1,p2,d2,s2,p3,d3,s3,a,b,c;
cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
a=p1*(100-d1)/100+s1;
b=p2*(100-d2)/100+s2;
c=p3*(100-d3)/100+s3;
cout<<"In Flipkart Rs."<<a<<endl;
cout<<"In Snapdeal Rs."<<b<<endl;  
cout<<"In Amazon Rs."<<c<<endl;  
if (a<=b && a<=c)
  cout<<"He will prefer Flipkart";
if (b<a && b<c)
  cout<<"He will prefer Snapdeal";
if (c<b && c<a)
  cout<<"He will prefer Amazon";
}