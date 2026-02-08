import java.util.*;
class IsomorphicStrings_205{
    public boolean IsomorphicStrings(String s, String t){
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = s.charAt(i);
            if(mapS[a] != mapT[b]){
                return false;
            }
            mapS[a] = i+1;
            mapT[b] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the first String: ");
        String s = sc.next();
        System.err.println("Enter the second String: ");
        String t = sc.next();
        IsomorphicStrings_205 obj = new IsomorphicStrings_205();
        System.out.println(obj.IsomorphicStrings(s, t));
    }
}