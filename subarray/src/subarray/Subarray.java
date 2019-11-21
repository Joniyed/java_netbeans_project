package subarray;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Subarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int arr[]=new int[n];
       int sum=0;
       int res=0;
       for(int i=0;i<n;i++)
       {
           arr[i]=input.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           {
               for(int k=i;k<=j;k++)
               {
                   System.out.print("{"+arr[k]+"},");
                   res+=arr[k];
               }
               if(res<0)
               {
                   sum++;
               }
               res=0;
               System.out.println("");
           }
       }
       System.out.println(sum);
    }
    
}
