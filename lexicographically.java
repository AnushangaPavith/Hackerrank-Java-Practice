import java.util.Scanner;

public class lexicographically {
        
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] subStrings = new String[s.length() - k + 1];
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int index = 0;

        for(int i = 0; i < s.length() - k + 1; i++) {
            String temp = "";
            for (int j = i; j < i + k; j++) {
                temp += s.charAt(j);
            }
            subStrings[index] = temp;
            index++;
        }
        for(int i = 0; i < subStrings.length; ++i) {  
            for (int j = i + 1; j < subStrings.length; ++j) {  
               if (subStrings[i].compareTo(subStrings[j]) > 0) {  
                  String temp = subStrings[i];  
                  subStrings[i] = subStrings[j];  
                  subStrings[j] = temp;
               }  
            }  
         }       
        
         smallest = subStrings[0];
         largest = subStrings[subStrings.length - 1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}