import java.util.*;
public class PeakELmentInMount_852 {
    public static int peakELmentInMount_852(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter size of the array: ");
        int n = sc.nextInt();
        System.err.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = peakELmentInMount_852(arr);
        System.err.println("Peak Element: "+result);
    }
}