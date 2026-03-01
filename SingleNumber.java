import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int ones = 0;
        int twos = 0;
        for(int num:arr){
            ones = (ones^num)&~twos;
            twos = (twos^num)&~ones;
        }
        System.out.println("Single number: "+ones);
    }
}
