#include<iostream>
using namespace std;
int main()
{
char input;
cin>>input;

if(int(input)>=65 && int(input)<=90 || int(input)>=97 && int(input)<=120 )
  if(input == 'a' || input == 'e' || input == 'i' || input == 'o' ||input == 'u' ||input == 'A' || input == 'E' || input == 'I' || input == 'O' ||input == 'U')
    cout<<"Vowel";
  else
    cout<<"Consonant";
else
    cout<<"Not an alphabet";  
}