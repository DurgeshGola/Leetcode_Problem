import java.util.*;
public class ValidAnagram {
    public static boolean  anagaram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String  a = sc.next();
        System.out.println("Enter the Second String: ");
        String b = sc.next();
        System.out.println(anagaram(a, b));
    }
}
