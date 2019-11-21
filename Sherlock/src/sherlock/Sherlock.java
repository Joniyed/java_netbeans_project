package sherlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Sherlock {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int q=input.nextInt();
        for(int i=0;i<q;i++)
        {
            int A=input.nextInt();
            int B = input.nextInt();
            
            int start=(int)Math.sqrt(A);
            int end= (int)Math.sqrt(B);
            
            int square=end-start;
            
            square+=(Math.pow(start, 2)>=A)?1:0;
            
            System.out.println(square);
        }
        
    }
    
}
