
package mergesort;

import java.util.Scanner;

public class Mergesort {
    public void merge(int arr[],int low,int mid,int high)
    {
       int temp[]=new int[arr.length];
       int i=low,j=mid+1,k=1;
       while(i<=mid && j<=high)
       {
           if(arr[i]<arr[j])
           {
               temp[k]=arr[i];
               i++;
               k++;
           }
           else
           {
               temp[k]=arr[j];
               j++;
               k++;
           }
       }
       while(i<=mid)
       {
           temp[k]=arr[i];
           i++;
           k++;
       }
       while(j<=high)
       {
           temp[k]=arr[j];
           j++;
           k++;
       }
       for(i=low,k=1;i<=high;i++,k++)
       {
           arr[i]=temp[k];
       }
    }
    
    public void devide(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=((low+high)/2);
            devide(arr,low,mid);
            devide(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args)
    {
       Mergesort jb=new Mergesort();
       Scanner input=new Scanner(System.in);
       int n=input.nextInt(),j;
       int arr[]=new int[n+1];
       int temp[] =new int[arr.length];
       int temp1[]=new int[arr.length];
       for(j=1;j<=n;j++)
       {
           arr[j]=input.nextInt();
           temp1[j]=arr[j];
           temp[j]=j;
       }
       
       jb.devide(arr,1,n);
       for(int i=1;i<n+1;i++)
       {
           //System.out.println(arr[i]+" = "+temp1[i]);
           for(j=1;j<n+1;j++)
           {
                if(arr[i]==temp1[j])
                {
                    System.out.println(arr[i]+" Position "+temp[j]);
                    temp1[j]=0;
                }
           }
       }
       
    }
    
}
