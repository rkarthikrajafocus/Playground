#include<iostream>
using namespace std;
int main()
{
int marks;
cin>>marks;
if (marks>100)
  cout<<"Invalid Input";
else if(marks==100)
  cout<<"S";
else if(marks>=90)
  cout<<"A";
else if(marks>=80)
  cout<<"B";
else if(marks>=70)
  cout<<"C"; 
else if(marks>=60)
  cout<<"D";
else if(marks>=50)
  cout<<"E";
else
  cout<<"F";    
}