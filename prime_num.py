'''

PRIME NUMBER (LOGIC 2)

'''

#PROGRAM

n = int(input('Enter Number : '))
c = 0
for i in range(1,n+1):
    if n%i==0:
        c+=1
if c == 2:
    print('It is a Prime Number ')
else :
    print('Not a Prime Number ')
