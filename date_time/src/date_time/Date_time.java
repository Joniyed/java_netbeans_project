
package date_time;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */



class Result{
    public static String findDay(int  month,int  day,int  year)
    {
        LocalDate date=LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
}
public class Date_time {

    public static void main(String[] args) throws IOException {

            Scanner input=new Scanner(System.in);
            int month = input.nextInt();
            int day = input.nextInt();
            int year = input.nextInt();
            String res = Result.findDay(month, day, year);
            System.out.println("Day of the week :"+ res);
    }
    
}
