from itertools import permutations
value,compare=input().split()
compare=int(compare)
a=''.join(sorted(value))
b=str(compare)

if len(a)<len(b):
  print(-1)
else:
  result=-1
  permlist=permutations(a)
  for i in permlist:
    str1=''.join(i)
    n=int(str1)
    if (n>compare):
      result=n
      break
  print(result)    