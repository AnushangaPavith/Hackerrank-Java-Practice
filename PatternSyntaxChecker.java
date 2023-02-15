import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        int count = 0;
		while(testCases>0){
			String pattern = in.nextLine();
            count++;
          	//Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e) {
                System.out.println("Invalid");
            }
            if(count >= testCases) {
                return;
            }
		}
	}
}



