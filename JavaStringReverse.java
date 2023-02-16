import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B += A.charAt(i);
        }
        
        String out = A.equals(B) ? "Yes" : "No";
        System.out.println(out);
        
    }
}