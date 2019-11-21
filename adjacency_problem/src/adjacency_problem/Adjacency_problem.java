package adjacency_problem;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Adjacency_problem {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row,column,i,j,k,l,search;
        System.out.print("Enter row: ");
        row=input.nextInt();
        System.out.print("Enter column: ");
        column=input.nextInt();
        int arr[][]=new int[row+1][column+1];
        System.out.println("Enter array : ");
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=column;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        System.out.print("Enter value for creating adjacency: ");
        search=input.nextInt();
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=column;j++)
            {
                if(arr[i][j]==search)
                {
                    System.out.print(arr[i-1][j-1]+" ");
                    System.out.print(arr[i-1][j]+" ");
                    System.out.println(arr[i-1][j+1]);
                    System.out.print(arr[i][j-1]+"   ");
                    System.out.println(arr[i][j+1]+" ");
                    System.out.print(arr[i+1][j-1]+" ");
                    System.out.print(arr[i+1][j]+" ");
                    System.out.println(arr[i+1][j+1]);
                }
            }
        }
    }
    
}
