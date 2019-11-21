
package beutiful_triplet;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Beutiful_triplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int d=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[j]-arr[i]==arr[k]-arr[j] && arr[j]-arr[i]==d)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
