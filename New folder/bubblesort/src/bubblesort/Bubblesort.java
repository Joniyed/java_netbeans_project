
package bubblesort;

import java.util.Scanner;

public class Bubblesort {

    
    public static void main(String[] args) 
    {
        int step=0;
        int temp;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int flag=0;
            
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
            step++;
        }
        
        System.out.println("\nTotal Step:"+step+"\n\n"+"After complete sort: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(""+arr[i]+" ");
        }
        System.out.println();
      
    }
     
}
