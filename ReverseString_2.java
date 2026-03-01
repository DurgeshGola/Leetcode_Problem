import java.util.*;
public class ReverseString_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println("Enter the target: ");
        int k = sc.nextInt();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i += 2*k){
            int left = i;
            int right = Math.min(i+k-1, arr.length-1);
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String A = new String(arr);
        System.out.println("Reverse String According to target: "+ A);
    }
}
