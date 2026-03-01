import java.util.*;
public class SortColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array(only 0,1,2): ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0, mid=0, high = size-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println("Sorted Colors:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
