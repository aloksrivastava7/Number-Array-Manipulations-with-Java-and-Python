'''

LONG DIVISION METHOD OF HCF

'''

#PROGRAM

n1 = int(input('Enter Number : '))     
n2 = int(input('Enter Number : '))
while n2!=0:
    temp = n2
    n2 = n1%n2
    n1 = temp
print('Greatest Common Divisor =',n1)    
