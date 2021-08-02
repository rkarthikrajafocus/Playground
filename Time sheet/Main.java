#include<iostream>
using namespace std;
int main()
{
int sun,mon,tue,wed,thr,fri,sat;
cin>>sun>>mon>>tue>>wed>>thr>>fri>>sat;
int b,br,r1,r2,r3,r4,r5,r6,r7,r8=0;
int ed,td,tr;
r1=sun*150;
r7=sat*125;
if(mon<=8)
r2=mon*100;
else 
  r2=mon*100+(mon-8)*15;

if(tue<=8)
  r3=tue*100;
else 
  r3=tue*100+(tue-8)*15;
  
if(wed<=8)
  r4=wed*100;
else 
  r4=wed*100+(wed-8)*15;
  
if(thr<=8)
  r5=thr*100;
else 
  r5=thr*100+(thr-8)*15;
  
if(fri<=8)
  r6=fri*100;
else 
  r6=fri*100+(fri-8)*15;
  
td=mon+tue+wed+thr+fri;
if(td>40)
  r8=((td-40)*125);

tr=r1+r2+r3+r4+r5+r6+r7+r8;

cout<<tr;

}