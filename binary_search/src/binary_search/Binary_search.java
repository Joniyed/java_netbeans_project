
package binary_search;

import java.util.Scanner;

public class Binary_search {
    
    static String binary_search(int a[],int temp[],int low,int high,int value)
    {
        
        if(low>high)
        {
            return "Not found";
        }
        int mid=(low+high)/2;
        if(a[mid]<value)
        {
            return binary_search(a,temp,mid+1,high,value);
        }
        else if(a[mid]>value)
        {
            return binary_search(a,temp,low,mid-1,value);
        }
        else if(a[mid]==value)
        {
            return ("Found in position : "+ (mid+1));
        }
        else return "Not found";
    }
    
    static int partition(int a[],int low,int high)
    {
        int pivot=a[high];
        int i=low-1,temp;
        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        
        return (i+1);
    }

    static void quick(int a[],int low,int high)
    {
        if(low<high)
        {
            int   q=partition(a,low,high);
            quick(a,low,q-1);
            quick(a,q+1,high);
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
        int temp[]=a;
        
        quick(a,0,n-1);
        
        System.out.println("After sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        System.out.println("");
        System.out.println("Enter value for find: ");
        int value=input.nextInt();
        
        String result=binary_search(a,temp,0,n-1,value);
        System.out.println(result);
    }
    
}
