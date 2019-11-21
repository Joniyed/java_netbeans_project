
package data_type;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Data_type {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n--!=0)
        {
           try{
               long  num=input.nextLong();
               System.out.println(num+" can be fitted in:");
               if(num>=-128 && num<=127)
               {
                   System.out.println("* byte");
               }
                if(num>=-(Math.pow(2, 15)) && num<=((Math.pow(2, 15))-1))
               {
                   System.out.println("* short");
               }
                if(num>=-(Math.pow(2, 31)) && num<=((Math.pow(2, 31))-1))
               {
                   System.out.println("* int");
               }
                if(num>=-(Math.pow(2, 63)) && num<=(Math.pow(2, 63))-1)
                {
                    System.out.println("* long");
                }
           }
           catch(Exception e )
           {
               System.out.println(input.next()+" can't be fitted anywhere.");
           }
        }
    }
    
}
