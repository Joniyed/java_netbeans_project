package array_rotation_simple;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Array_rotation_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int q=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }

        for(int i=0; i<q; i++)
        {
            int m=input.nextInt();
            System.out.println(arr[(n-(k%n)+m)%n]);
        }
        
    }
    
}
