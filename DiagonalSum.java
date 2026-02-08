import java.util.*;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        //Input
        System.err.println("Enter the Elements of the 2D array: ");
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Output
        System.out.println("Original Array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        //Diagonal Sum of the 2D Array..
        System.out.println("Diagonal Sum of the Array: ");
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i][i];
            if(i != n-1-i){
                sum += arr[i][n-1-i];
            }
        }
        System.out.println(sum);
    }
}