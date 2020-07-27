import java.util.Scanner;
class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // no. of elements
        int arr[],revarr[]; //arr : original array , revarr : reversed array
        System.out.println("***** Enter no. of Elements *****");
        n = sc.nextInt();
        arr = new int[n];
        revarr = new int[n];
        System.out.println("***** Enter Array Elements *****");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 0; //represents index value of reversed array
        for (int i = n-1; i >= 0 ; i--) {
            revarr[k] = arr[i]; //Storing elements of arr from the back
            k++;
        }
        System.out.println("***** Original Array ******"); //Printing Original Array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("***** Reversed Array *****"); //Printing Reversed Array
        for (int i = 0; i < n; i++) {
            System.out.println(revarr[i]);
        }
    }
}
