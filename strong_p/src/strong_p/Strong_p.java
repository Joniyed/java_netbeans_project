
package strong_p;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Strong_p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        
        String a[]=s.split("[a-z0-9!@#$%^&*()+-]+");
        String b[]=s.split("[A-Z0-9!@#$%^&*()+-]+");
        String c[]=s.split("[a-zA-Z!@#$%^&*()+-]+");
        String d[]=s.split("[a-z0-9A-Z]+");
        int count=0;
            if(a.length>0) count++;
            if(b.length>0) count++;
            if(c.length>0) count++;
            if(d.length>0) count++;
            count=4-count;
        if(s.length()<6)
        {
            if(count>(6-s.length()))
            {
                System.out.println(count);
            }
            else System.out.println(6-s.length());
        }
        else {
            
            System.out.println(count);
        }
        
    }
    
}
