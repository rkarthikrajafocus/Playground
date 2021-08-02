lst = []

n = int(input())
  
for i in range(0, n):
    ele = int(input())
    lst.append(ele) # adding the element

lst.sort()

print( lst[-1])