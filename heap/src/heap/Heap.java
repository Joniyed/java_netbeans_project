
package heap;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Heap {
    
    public static  int arr[]=new int[100];
    public static int n=0;
    
    public static void display()
    {
        System.out.println("");
        System.out.print("Heap is  ---  ");
        if(n==0)
        {
            System.out.println("empty. ");
        }
        System.out.println("");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
    public static void delete()
    {
        if(n==0)
        {
            System.out.println("Heap is empty. ");
        }
        else
        {
            int left,right,temp,par=0;
            arr[0]=arr[n-1];
            n=n-1;
            left=2*par+1;
            right=2*par+2;
            while(right<n)
            {
                if(arr[right]>=arr[par] && arr[left]>=arr[par])
                {
                    return;
                }
                else if(arr[right]>=arr[left])
                {
                    temp=arr[par];
                    arr[par]=arr[left];
                    arr[left]=temp;
                   par=left;
                }
                else
                {
                    temp=arr[par];
                    arr[par]=arr[right];
                    arr[right]=temp;
                    par=right;
                }
                left=2*par+1;
                right=2*par+2;
            }
            if(left==n-1 && arr[left]<arr[par])
            {
                temp=arr[par];
                arr[par]=arr[left];
                arr[left]=temp;
            }
        }
    }
    
    public static void insert(int num,int loc)
    {
        while(loc>0)
        {
            int par=(loc-1)/2;
            if(arr[par]<=num)
            {
                arr[loc]=num;
                return;
            }
            arr[loc]=arr[par];
            loc=par;
        }
        arr[0]=num;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many operation : ");
        int op=input.nextInt();
        while(op>0)
        {
            op--;
            System.out.println("\n1.Insert\n"+"2.Delete\n"+"3.Find\n"+"4.Display");
            System.out.println("\nEnter your choice: ");
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("\n"+"Enter number for insert:  ");
                    int num=input.nextInt();
                    insert(num,n);
                    n++;
                    break;
                }
                case 2:
                {
                    delete();
                    break;
                }
                case 3:
                {
                    System.out.println("\n"+"Min value is : "+arr[0]);
                    break;
                }
                case 4: 
                {
                    display();
                    break;
                }
                default :
                    System.out.println("\n"+"Wrong choice........."+"\n"+"\n");
                    break;
            }
        }
    }
    
}
