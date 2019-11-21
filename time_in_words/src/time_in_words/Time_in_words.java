package time_in_words;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Time_in_words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int h=input.nextInt();
        int m=input.nextInt();
        String O=" o' clock";
        String fifteen="quarter past ";
        String F45="quarter to ";
        String half="half past ";
        String minute=" minute past ";
        
        if(m==00)
        {
            switch(h){
                case 1:  
                    System.out.println("one"+O);
                    break;
                case 2:   
                    System.out.println("Two"+O);
                    break;
                case 3:   
                    System.out.println("three"+O);
                    break;
                case 4:   
                    System.out.println("four"+O);
                    break;
                case 5:   
                    System.out.println("five"+O);
                    break;
                case 6:   
                    System.out.println("six"+O);
                    break;
                case 7:   
                    System.out.println("seven"+O);
                    break;
                case 8:   
                    System.out.println("eight"+O);
                    break;
                case 9:   
                    System.out.println("nine"+O);
                    break;
                case 10:   
                    System.out.println("ten"+O);
                    break;
                case 11:   
                    System.out.println("eleven"+O);
                    break;
                case 12:   
                    System.out.println("twelve"+O);
                    break;
                default:   
                    System.out.println("zero"+O);
                    break;    
            }
        }
        else if(m==15)
        {
             switch(h){
                case 1:  
                    System.out.println(fifteen+"one");
                    break;
                case 2:   
                    System.out.println(fifteen+"two");
                    break;
                case 3:   
                    System.out.println(fifteen+"three");
                    break;
                case 4:   
                    System.out.println(fifteen+"four");
                    break;
                case 5:   
                    System.out.println(fifteen+"five");
                    break;
                case 6:   
                    System.out.println(fifteen+"six");
                    break;
                case 7:   
                    System.out.println(fifteen+"seven");
                    break;
                case 8:   
                    System.out.println(fifteen+"eight");
                    break;
                case 9:   
                    System.out.println(fifteen+"nine");
                    break;
                case 10:
                    System.out.println(fifteen+"eleven");
                    break;
                case 11:
                    System.out.println(fifteen+"twelve");
                    break;
                case 12:
                    System.out.println(fifteen+"one");
                    break;
                default:   
                    System.out.println(fifteen+"zero");
                    break;
             }
        }
        else if(m==45)
        {
            switch(h){
                case 1:  
                    System.out.println(F45+"two");
                    break;
                case 2:   
                    System.out.println(F45+"three");
                    break;
                case 3:   
                    System.out.println(F45+"four");
                    break;
                case 4:   
                    System.out.println(F45+"five");
                    break;
                case 5:   
                    System.out.println(F45+"six");
                    break;
                case 6:   
                    System.out.println(F45+"seven");
                    break;
                case 7:   
                    System.out.println(F45+"eight");
                    break;
                case 8:   
                    System.out.println(F45+"nine");
                    break;
                case 9:   
                    System.out.println(F45+"ten");
                    break;
                case 10:
                    System.out.println(F45+"eleven");
                    break;
                case 11:
                    System.out.println(F45+"twelve");
                    break;
                case 12:
                    System.out.println(F45+"one");
                    break;
                default:   
                    System.out.println(F45+"zero");
                    break;
             }
        }
        else if(m==30)
        {
            switch(h){
                case 1:  
                    System.out.println(half+"one");
                    break;
                case 2:   
                    System.out.println(half+"two");
                    break;
                case 3:   
                    System.out.println(half+"three");
                    break;
                case 4:   
                    System.out.println(half+"four");
                    break;
                case 5:   
                    System.out.println(half+"five");
                    break;
                case 6:   
                    System.out.println(half+"six");
                    break;
                case 7:   
                    System.out.println(half+"seven");
                    break;
                case 8:   
                    System.out.println(half+"eight");
                    break;
                case 9:   
                    System.out.println(half+"nine");
                    break;
                case 10:
                    System.out.println(half+"ten");
                    break;
                case 11:
                    System.out.println(half+"eleven");
                    break;
                case 12:
                    System.out.println(half+"twelve");
                    break;
                default:   
                    System.out.println(half+"zero");
                    break;
             }
        }

    }
    
}
