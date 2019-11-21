
package maxheap;

import java.util.Scanner;

public class Maxheap {
    
    public static int arr[]=new int[100];
    public static int n=0;
    
    public static void display()
    {
        if(n==0)
        {
            System.out.println("Heap is empty. ");
        }
        else
        {
            System.out.print("Heap is: ");
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
    
    public static void delete()
    {
        if(n==0)
        {
            System.out.println("Heap is empty..........");
        }
        else
        {
            int left,right,par=0,temp;
            left=2*par+1;
            right=2*par+2;
            
            arr[0]=arr[n-1];
            n=n-1;
            while(right<n)
            {
                if(arr[right]<arr[par] && arr[left]<arr[par])
                {
                    return;
                }
                else if(arr[right]<arr[left])
                 {
                        temp=arr[left];
                        arr[left]=arr[par];
                        arr[par]=temp;
                        par=left;
                  }
                else
                    {
                        temp=arr[right];
                        arr[right]=arr[par];
                        arr[par]=temp;
                    }
                left=2*par+1;
                right=2*par+2;
            }
            if(left==n-1 && arr[left]>arr[par])
            {   
                temp=arr[par];
                arr[par]=arr[left];
                arr[left]=temp;
            }
        }
    }
    
    public static void insert(int num,int n)
    {
        while(n>0)
        {
            int par=(n-1)/2;
            if(arr[par]>=num)
            {
                arr[n]=num;
                return;
            }
            else
            {
                arr[n]=arr[par];
                n=par;
            }
        }
        arr[0]=num;
    }
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many opearation do you want: ");
        int op=input.nextInt();
        while(op>0)
        {
            op--;
            System.out.println("\n1.insert\n2.Delete\n3.Find\n4.Display");
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter number for insert: ");
                    int num=input.nextInt();
                    insert(num,n);
                    n=n+1;
                    break;
                }
                case 2:
                {
                    delete();
                    break;
                }
                case 3:
                {
                    System.out.println("Max number is : "+arr[0]);
                    break;
                }
                case 4:
                {
                    display();
                    break;
                }
                default:
                    break;
            }
        }
    }
    
}
