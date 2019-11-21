
package quick_sort;


import java.util.Scanner;

public class Quick_sort {
    
    public int  partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1,temp;
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
    }
    
    public void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int q=partition(arr,low,high);
            quicksort(arr,low,q-1);
            quicksort(arr,q+1,high);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        Quick_sort jb=new Quick_sort();
        System.out.println("Input array size: ");
        int size=input.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array value:");
        for(int i=0;i<size;i++)
        {
            a[i]=input.nextInt();
        }
        
        jb.quicksort(a,0,size-1);
        
        System.out.println("After sort :");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
