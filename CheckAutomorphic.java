

















/*
 * Program to Check whether a number is Palindrome or not.
 */

// PROGRAM 
import java.util.Scanner;
class CheckAutomorphic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,temp,square,c=0,p;
        System.out.println("Enter Number");
        num = sc.nextInt();
        square = num * num;
        temp = num;
        while(temp!=0)
        {
            c++;
            temp = temp/10;
        }
        p = (int)(Math.pow(10,(c)));
        if(square%p==num)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
}