import java.util.Scanner;
class CheckPrime
{
    public static void main(String args[])
    {
        int num;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        num = sc.nextInt();
        for(int i = 2;i<=num/2;i++)
        {
            if (num%i==0)
            {
                flag = false;
                break;
            }
            
        }
        if (flag == true)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is Not Prime");
    }
}