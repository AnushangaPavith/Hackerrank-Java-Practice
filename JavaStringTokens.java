import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        // String s = "He is a very very good boy, isn't he?";
        String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  ";
        // Write your code here.

        String[] subStrings = s.split("[,!?._'@ ]");
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.addAll(Arrays.asList(subStrings));

        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).isEmpty()) {
                wordList.remove(i);
                i--;
            }
        }

        System.out.println(wordList.size());
        for (String string : wordList) {
            System.out.println(string);
        }
    }
}

