


































































































































/*
 * Program to Calculate Sum of Digits
*/
 
// PROGRAM :

import java.util.Scanner;
class SumOfDigits
{
    static Scanner sc = new Scanner(System.in);
    int num,sum = 0;
    void input()
    {
        System.out.println("Enter a Number");
        num = sc.nextInt();
    }
    int sumdigits()
    {
        while(num!=0)
        {
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int result;
        SumOfDigits obj = new SumOfDigits();
        obj.input();
        result = obj.sumdigits();
        System.out.println("Sum Of Digits = "+result);
    }
}