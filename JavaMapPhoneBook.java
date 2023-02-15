//Complete this code or write your own from scratch
import java.util.*;

class Solution{
	public static void findPhoneNumber()
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
        Map <String, Integer> phoneBook = new HashMap<String, Integer>();
		scanner.close();
        
		for(int i=0;i<n;i++)
		{
			String name=scanner.nextLine();
			int phone=scanner.nextInt();
			scanner.nextLine();
            
            phoneBook.putIfAbsent(name, phone);
		}
        
		while(scanner.hasNext())
		{
			String s=scanner.nextLine();
            if(phoneBook.get(s) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
		}
	}
}

public class JavaMapPhoneBook {

    public static void main(String[] args) {
        Solution.findPhoneNumber();
    }
}
