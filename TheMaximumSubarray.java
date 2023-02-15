import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     
    public static int findMax(int a, int b, int c) {
        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        else return c;
        
    }

    public static List<Integer> maxSubarray(List<Integer> data) {
        // Array to store sum
        int[] sumArr = new int[data.size()];
        // Max value
        int maxVal = data.get(0);
        sumArr[0] = data.get(0);
        
        for(int i = 1; i < data.size(); i++) {

            if(sumArr[i - 1] + data.get(i) >= data.get(i)) sumArr[i] = sumArr[i - 1] + data.get(i);
            else sumArr[i] = data.get(i);

            // Replace max sub-array value
            if (sumArr[i] >= maxVal) maxVal = sumArr[i];
        }
        
        int maxVal2 = 0;
        int MAX = data.get(0);
        
        for(int j = 0; j < data.size(); j++) {
            int temp = data.get(j);
            if(temp > 0) maxVal2 += temp;
            
            if(data.get(j) > MAX) MAX = data.get(j);
        }
        if(maxVal2 ==0) maxVal2 = MAX;
        
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(maxVal);
        answer.add(maxVal2);

        return answer;

    }

}

public class TheMaximumSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
