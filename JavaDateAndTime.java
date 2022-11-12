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
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Map <Integer, String> weekDays = new HashMap<>();
        weekDays.put(1, "SUNDAY");
        weekDays.put(2, "MONDAY");
        weekDays.put(3, "TUESDAY");
        weekDays.put(4, "WEDNESDAY");
        weekDays.put(5, "THURSDAY");
        weekDays.put(6, "FRIDAY");
        weekDays.put(7, "SATURDAY");
        
        
        final Calendar myDate = Calendar.getInstance();
        myDate.set(Calendar.YEAR, year);
        myDate.set(Calendar.MONTH, month - 1);
        myDate.set(Calendar.DAY_OF_MONTH, day);
        
        int date = myDate.get(Calendar.DAY_OF_WEEK);
        
        return weekDays.get(date);
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
