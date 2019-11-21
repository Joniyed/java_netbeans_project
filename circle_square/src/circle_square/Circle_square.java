
package circle_square;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Circle_square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        if(T>1000){
            
        }
        else{
        int count=1;
        while(T-->0)
        {
            float r=input.nextFloat();
            if(r>1000 || r<0)
            {
                break;
            }
            else
            {
                float res=(float)(Math.pow(r*2, 2)-(2*Math.pow(r, 2)));
                System.out.printf("Case "+count+": "+"%.2f",res);
                System.out.println("");
                count++;
            }
        }
        }
    }
    
}
