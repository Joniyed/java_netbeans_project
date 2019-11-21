
package java_end_of_file;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Java_end_of_file {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        String s;
        int i=1;
        while(input.hasNext())
        {
            s=input.nextLine();
                if(!"EOF".equals(s))
                {
                        System.out.println(i+" "+s);
                        i++;
                }
                else 
                {
                    System.out.print("{-truncated-}");
                    break;
                }
        }
    }
    
}
