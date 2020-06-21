#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
float age, time;
cin>> age >> time;
if (time==float(13.30) && age>13)
  cout<<"$5.00";
else if (time==float(13.30) && age<=13)
 cout<<"$2.00";
else if (age<=13)
 cout<<"$4.00";
else
 cout<<"$8.00";  
}