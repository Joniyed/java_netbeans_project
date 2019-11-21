
package save_prisonar;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Save_prisonar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int n=input.nextInt();
        while(n-->0)
        {
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            
            c=(c+b-1)%a;
            if(c==0)
                c=a;
            else System.out.println(c);
        }
    }
    
}
