
package bubble;

import java.util.Scanner;

public class Bubble {

    static void bubble(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
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
        
        bubble(a,n-1);
        
        System.out.println("After sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    
}
