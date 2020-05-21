/*
 * Program to Check whether a number is Palindrome or not.
 */

// PROGRAM :

import java.util.Scanner;
class CheckPalindrome
{
    static Scanner sc = new Scanner(System.in);
    static int num,temp,rev = 0;
    void input()
    {
        System.out.println("Enter the Number ");
        num = sc.nextInt();
    }
    int check()
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
        CheckPalindrome obj = new CheckPalindrome();
        obj.input();
        result = obj.check();
        if(result==num)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a Palindrome Number");
    }
}
