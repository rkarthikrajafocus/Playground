#include<iostream>
#include<iomanip>
#include<math.h>
using namespace std;
int main()
{
float n,count=0;
cin>>n;
int days,ans;
for(int i=0;i<n;i++)
count=count+(1/sqrt(n));
ans=n+count;
cout<<setprecision(2)<<ans+1;
}
