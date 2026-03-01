import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the taregt: ");
        int target = sc.nextInt();
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = binarySearch(arr, target);
        System.out.println("Searching Object: "+result);
    }
}