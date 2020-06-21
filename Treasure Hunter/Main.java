#include<iostream>
using namespace std;
int main()
{
int a, b, c;
cin>> a >> b>> c;  
cout<< a*b/100 <<endl;
cout<< (a-a*b/100)*c/100 <<endl;
cout<< (a-a*b/100-(a-a*b/100)*c/100)/3 <<endl;

}