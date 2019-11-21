package insertion;

import java.util.Scanner;

public class Insertion {
    
    public static void merg(int a[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=1;
        int temp[]=new int[100];
        while(i<=mid && j<=high )
        {
            if(a[i]<a[j])
            {
                temp[k]=a[i];
                k++;
                i++;
            }
            else
            {
                temp[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            temp[k]=a[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k]=a[j];
            j++;
            k++;
        }
        for(i=low,k=1;i<=high;i++,k++)
        {
            a[i]=temp[k];
        }
    }
    
    public static void divide(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide(a,low,mid);
            divide(a,mid+1,high);
            merg(a,low,mid,high);
        }
    }

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Enter size");
         int n=input.nextInt();
         System.out.println("Enter array value: ");
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
                a[i]=input.nextInt();
         }
         
            divide(a,0,n-1);
         
         System.out.println("Array value: ");
         for(int i=0;i<n;i++)
         {
             System.out.println(a[i]+" ");
         }
    }
    
}
