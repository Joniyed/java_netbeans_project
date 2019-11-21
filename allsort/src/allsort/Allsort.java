
package allsort;

import java.util.Scanner;

public class Allsort extends bubble
{
    
    public static void display(int arr[],int n)
    {
        if(n==0)
        {
            System.out.println("Empty...");
            return;
        }
        System.out.println("After sorting ......\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int wh=0;
        while(wh>-1)
        {
            wh++;
            System.out.println("Enter size: ");
            int n=input.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter array : ");
            for(int i=0;i<n;i++)
            {
                arr[i]=input.nextInt();
            }
            System.out.println("\n1.Bubble\n2.insertion\n3.quick\n4.merg\n5.exit\n");
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    bubble_s(arr,n);
                    display(arr,n);
                    break;
                }
                case 2:
                {
                    insertion_s(arr,n-1);
                    display(arr,n);
                    break;
                }
                case 3:
                {
                    divide(arr,0,n-1);
                    display(arr,n);
                    break;
                }
                case 4:
                {
                    divide_m(arr,0,n-1);
                    display(arr,n);
                    break;
                }
                case 5:
                    return;
            }
        }
        
    }
    
}
