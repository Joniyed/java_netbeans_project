
package jumping_cloud;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Jumping_cloud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int count=0;
        int i=0;
        while(i<n-2)
        {
            if(arr[i+2]==0)
            {
                i=i+2;
                count++;
            }
            else if(arr[i+1]==0)
            {
                i++;
                count++;
            }
            else{
                count++;
                i=i+2;
            }
            if(i==n-2) count++;

            
        }
        if(n==2)
        {
            System.out.println(1);
        }
        else 
        {
            System.out.println(count);
        }
    }
    
}

