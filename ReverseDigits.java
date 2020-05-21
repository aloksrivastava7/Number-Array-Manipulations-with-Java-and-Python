/*
 * Pragram to find Reverse of a Number
*/

// PROGRAM :

import java.util.Scanner;
class ReverseDigits
{
    int  num,temp,rev = 0;
    static Scanner sc = new Scanner(System.in); 
    void input()
    {
        System.out.println("Enter a Number");
        num = sc.nextInt();
    }
    int reverse()
    {
        temp = num;
        while(temp!=0)
        {
           int rem = temp%10;
           rev = rev*10+rem;
           temp = temp/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        int result;
        ReverseDigits obj = new ReverseDigits();
        obj.input();
        result = obj.reverse();
        System.out.println("Reverse of Digits = "+result);
    }
}