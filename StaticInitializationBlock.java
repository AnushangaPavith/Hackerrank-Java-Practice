import java.util.*;

public class StaticInitializationBlock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int B = Integer.parseInt(scanner.nextLine());
        int H = Integer.parseInt(scanner.nextLine());
        
        if(B <= 0 || H <= 0) System.out.println("java.lang.Exception: Breadth and height must be positive");
        else System.out.println(B * H);

        scanner.close();
    }
}