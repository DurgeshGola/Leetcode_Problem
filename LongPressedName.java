import java.util.*;
public class LongPressedName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String name = sc.next();
        System.out.println("Enter the Second String: ");
        String typed = sc.next();

        int i = 0;
        int j= 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(j > 0 &&  typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }
            else{
                System.out.println("False");
                return;
            }
        }
        if(i==name.length()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
