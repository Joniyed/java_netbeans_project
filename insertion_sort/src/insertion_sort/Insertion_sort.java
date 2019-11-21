package insertion_sort;

import java.util.Scanner;

public class Insertion_sort {
    
    static void insertion(int a[],int n)
    {
        int i=1;
        while(i<=n)
        {
            int x=a[i];
            int j=i-1;
            while(j>=0 && a[j]>x)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=x;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter value: ");
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        
           insertion(a,n-1);
            
        System.out.println("After sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
