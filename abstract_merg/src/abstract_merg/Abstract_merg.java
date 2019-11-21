
package abstract_merg;

import java.util.Scanner;

public class Abstract_merg {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array value: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        abstracts jb=new merg();
        jb.devide(arr, 0, n-1);
        System.out.println("After sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
