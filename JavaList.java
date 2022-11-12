import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        List <Integer> L = new ArrayList<Integer>();
        
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        
        int Q = scanner.nextInt();
        
        for(int i = 0; i < Q; i++) {
            String query = scanner.next();
            if(query.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                
                if(L.size() > index) L.add(index, value);
                else L.add(value);
            
            }
            
            else if(query.equals("Delete")) {
                int index = scanner.nextInt();
                
                L.remove(index);
            }
        }
        
        scanner.close();
        
        for (Integer integer : L) {
            System.out.print(integer + " ");
        }
    }
}
