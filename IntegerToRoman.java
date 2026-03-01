import java.util.*;
public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for change: ");
        int num = sc.nextInt();
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str1 = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0;
        String str2 = new String();
        while(num > 0){
            if(num >= arr[i]){
                str2 = str2 + str1[i];
                num -= arr[i];
            }
            else{
                i++;
            }
        }
        System.out.println(str2);
    }
}
