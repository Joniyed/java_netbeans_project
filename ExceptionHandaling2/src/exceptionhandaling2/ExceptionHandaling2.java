package exceptionhandaling2;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
class MyCalculator{
    int power(int n,int p) throws Exception{
        if(n<0 || p<0)
        {
            throw new Exception("n or p should not be negative.");
        }
        else if(n==0 && p==0)
        {
            throw new Exception("n and p should not be zero.");
        }
        else return (int) Math.pow(n, p);
    }
}

public class ExceptionHandaling2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MyCalculator jb=new MyCalculator();
        while(input.hasNext())
        {
            int n=input.nextInt();
            int p=input.nextInt();
            try{
                System.out.println(jb.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            String exit=input.next();
            String e="exit";
        }
    }
    
}
