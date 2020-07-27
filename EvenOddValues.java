import java.util.Scanner;
class EvenOddValues {
    public static void main(String args[])
    {
        int sum_even = 0,sum_odd = 0;
        int n , arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Enter Size of Array *****");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("***** Enter Array Elements *****");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            if(arr[i]%2==0) //Check if the Value is Even
                sum_even = sum_even + arr[i];
            else
                sum_odd = sum_odd + arr[i]; //For Odd Values
        }
        System.out.println("***** Array Elements are *****");
        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Sum of Even Values : "+sum_even);
        System.out.println("Sum of Odd Values : "+sum_odd);
    }
}
