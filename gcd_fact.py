'''
Factorization Method 
1) 14 = 2 x 7
   24 = 2 x 2 x 2 x 3
   therfore greatest common divisor = 2
2) 15 = 3 x 5
   75 = 3 x 5 x 5
   therfore greatest common divisor = 3 x 5 = 15
'''

#PROGRAM

n1 = int(input('Enter Number ')) # Jinka Jinka nikalna tha unka input kara liya
n2 = int(input('Enter Number '))
if n1<n2 :                       # Dono mein se chota wala number pata krne ke liye          
    min = n1
else :
    min = n2    
gcd = 0
for i in range(1,min+1):         # Chote wale number tak ka loop
    if n1%i==0 and n2%i==0:      # Check krne ke liye ki factor hai ki nhi
        gcd = i                  # Agr dono ka factor hai toh usko gcd variable mein store kara liya 

print('Greatest Common Divisor = ',gcd)        # Print kara Diya 
    
