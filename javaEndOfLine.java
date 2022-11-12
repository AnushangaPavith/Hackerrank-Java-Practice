import java.util.*;

class Solution {

    public static void myMain() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(count + " " + line);
            count++;
        }
        
        scanner.close();
    }
}

public class javaEndOfLine {
    public static void main(String[] args) {
        Solution.myMain();
    }
}