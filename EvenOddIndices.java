import java.util.Scanner;
class EvenOddIndices {
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
        int k = 1;  //Stores the index no.'s from 1 - n
        for(int i = 0;i<n;i++)
        {
            if(k%2==0) { //Checking if The index is Even
                sum_even = sum_even + arr[i];
                k++;
            }
            else {  //For Odd Indices
                sum_odd = sum_odd + arr[i];
                k++;
            }
        }
        System.out.println("***** Array Elements are *****");
        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Sum of Even Indices : "+sum_even);
        System.out.println("Sum of Odd Indices : "+sum_odd);
    }
}
