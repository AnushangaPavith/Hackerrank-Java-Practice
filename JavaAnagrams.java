import java.util.Scanner;

public class JavaAnagrams {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;
        
        int[] countArr = new int[26];
        
        for(int i = 0; i < a.length(); i++) {
           if(a.charAt(i) >= 'a') countArr[(int)a.charAt(i) - 97]++;
           else countArr[(int)a.charAt(i) - 65]++;
           
           if(b.charAt(i) >= 'a') countArr[(int)b.charAt(i) - 97]--;
           else countArr[(int)b.charAt(i) - 65]--;
        }
        for (int i : countArr) {
            if(i != 0) return false;
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
