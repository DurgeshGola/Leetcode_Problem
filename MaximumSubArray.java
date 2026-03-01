import java.util.*;
public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number of length: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=num; i<n; i++){
            sum += nums[i]-nums[i-num];
            maxSum = Math.max(maxSum, sum);
        }
        double result = maxSum/num;
        System.out.println("Maximum Average of SubArray: "+result);
    }
}
