
package selectionsort;

import java.util.Scanner;

public class Selectionsort
{
    public int  isSorted(int size,int arr[])
    {
        if(size<=1)
            return 1;
        if(arr[size-1]>=arr[size-2])
            return isSorted(size-1,arr);
        else return 0;
    }
    public static void main(String[] args) 
    {
        Selectionsort jb=new Selectionsort();
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size],temp,step=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            step+=i+1;
            int minimum=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minimum])
                {
                    minimum=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minimum];
            arr[minimum]=temp;
            if(jb.isSorted(size,arr)==1)
                break;
        }
        System.out.println("Step: "+step);
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
