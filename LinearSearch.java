import java.util.*;
public class LinearSearch {
    public int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target for searching: ");
        int target = sc.nextInt();
        LinearSearch obj = new LinearSearch();  // for changing non-static into static 
        int result = obj.linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Target not found in array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}