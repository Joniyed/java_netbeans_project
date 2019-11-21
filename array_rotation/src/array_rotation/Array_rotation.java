package array_rotation;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Array_rotation {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int m=input.nextInt();
        int n=input.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
