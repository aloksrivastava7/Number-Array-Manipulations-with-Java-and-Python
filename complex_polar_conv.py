'''

You are given a complex . Your task is to convert it to polar coordinates.

Sample Input : 1+2j

Sample Output : 2.23606797749979 
                1.1071487177940904
 
'''

#PROGRAM

import math
import cmath
cmplx = input()
print(abs(complex(cmplx)))
print(cmath.phase(complex(cmplx)))
