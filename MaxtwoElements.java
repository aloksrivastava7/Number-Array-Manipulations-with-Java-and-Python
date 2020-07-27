import java.util.Scanner;
class MaxtwoElements {
    public static void main(String[] args) {
        int n,arr[],max1 = 0,max2 = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("***** Enter Size of Array ******");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("***** Enter Array Elements *****");
        for (int i = 0; i < n; i++) { //Asking Input from User
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>max1) //Checking for maximum element
            {
                max1 = arr[i]; //Storing it in max1
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]>max2 && arr[i]!=max1) //Checking for second maximum element excluding the previous one
            {
                max2 = arr[i]; //Storing it in max2
            }
        }
        System.out.println("Maximum Element : "+max1);
        System.out.println("2nd Maximum Element : "+max2);
    }
}
