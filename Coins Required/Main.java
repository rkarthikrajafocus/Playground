value=int(input())

#five rupee coins
five=int((value-4)/5)

#one rupee coins
if(value-five*5)%2==0:
  one=2
else:
  one=1
#two rupee coins
two=(value-five*5-one*1)//2

print(five+two+one,five,two,one)
