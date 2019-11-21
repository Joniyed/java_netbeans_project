package cloud_jumping;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Cloud_Jumping {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int k=input.nextInt();
       int arr[]=new int[n];
       int e=100;
       for(int i=0;i<n;i++)
       {
           arr[i]=input.nextInt();
       }
       if(n%k!=0)
       {
           e=e-n*2;
       }
       else 
       {
            for(int j=0;j<n;j=j+k)
            {
                if(arr[j]==1)
                {
                    e=e-1-2;
                }
                else e=e-1;
            }
       }
        System.out.println(e);
    }
    
}
