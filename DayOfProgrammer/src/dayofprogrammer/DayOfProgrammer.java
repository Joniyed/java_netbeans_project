package dayofprogrammer;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class DayOfProgrammer {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int y=input.nextInt();
        if(y%400==0 || (y%4==0 && y%100!=0))
        {
            int sum=31+29+31+30+31+30+31+31;
            System.out.println((256-sum)+"."+"09"+"."+y);
        }
        else {
            int sum=31+28+31+30+31+30+31+31;
            System.out.println((256-sum)+"."+"09"+"."+y);          
        }
    }
    
}
