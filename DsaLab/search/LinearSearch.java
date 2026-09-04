package DsaLab.search;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int size, int target){
        for(int i=0; i<size; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter the Target Value :");
        int key = sc.nextInt();

        int result = linearSearch(arr, n, key);

        if(result != -1){
            System.out.println("Target found at index :"+result);
        }else{
            System.out.println("Target is Not Found!");
        }
        
        sc.close();
    }
}
