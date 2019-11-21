
package calendar_class;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author JONIYED
 */

 class Result{
    public static String findDay(int month,int day,int year)
    {
        LocalDate date=LocalDate.of(year,month,day);
        return date.getDayOfWeek().toString();
    }
}
public class Calendar_class {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
         public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        //bufferedWriter.write(res);
        //bufferedWriter.newLine();
             System.out.println(res);

        bufferedReader.close();
        //bufferedWriter.close();
    }
    
}
