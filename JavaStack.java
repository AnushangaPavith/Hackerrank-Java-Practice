import java.util.*;
class Solution{
    
    public static char findclose(char in) {
        if(in == ')') return '(';
        if(in == '}') return '{';
        if(in == ']') return '[';
        else return 0;        
    }
	
	public static void testStack()
	{
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String input=scanner.next();
            //Complete the code
            
            Stack<Character> stack = new Stack<Character>();
            
            for(int i = 0; i < input.length(); i++) {
                if(stack.empty()) stack.push(input.charAt(i));
                else if(stack.peek() == findclose(input.charAt(i))) stack.pop();
                else stack.push(input.charAt(i));
            }
            if(stack.empty()) System.out.println("true");
            else System.out.println("false");
		}

        scanner.close();
		
	}
}


public class JavaStack {
    public static void main(String[] args) {
        Solution.testStack();
    }
}
