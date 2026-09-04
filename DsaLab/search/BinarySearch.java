import java.util.Scanner;

public class BinarySearch {
    
    public static int binarySearch(int[] arr , int size, int target){

        int low = 0;
        int high = size - 1;

        while(low<= high){
            int mid = (low + high)/2;
            //int mid = low + (high - low)/2

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]< target){
                low = mid + 1;
            }else{
                high = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the Array Elements:");
        for (int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the Target Number:");
        int target = sc.nextInt();

        int result = binarySearch(arr, n, target);

        if(result != -1){
            System.out.println("Target found at Index:"+result);
        }else{
            System.out.println("Target Not Found!");
        }
        sc.close();
    }
    
}
