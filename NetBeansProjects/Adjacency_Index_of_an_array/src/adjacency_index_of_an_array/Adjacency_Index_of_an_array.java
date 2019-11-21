
package adjacency_index_of_an_array;

import java.util.Scanner;

public class Adjacency_Index_of_an_array {

    public static void main(String[] args) {
    int row,col,value;
    System.out.print("give the size of row = ");
    Scanner mk = new Scanner(System.in);
    row = mk.nextInt();
    System.out.print("give the size of column = ");
    col = mk.nextInt();
    System.out.println("give the array = ");   
    int arr[][] = new int[100][100];
     for(int i = 1;i<=row;i++)
     {
        for(int j = 1;j<=col;j++)
        {
           arr[i][j] = mk.nextInt();
        }
     }
     System.out.print("give the serching value = ");
     value = mk.nextInt();
       for(int i = 1;i<=row;i++)
       {
           for(int j = 1;j<=col;j++)
           {
               if(arr[i][j]==value)
               {
                   System.out.println("Adjacency index : ");
                   for(int k = 1;k<=3;k++)
                   {
                       System.out.print(arr[i-1][k]+" ");
                   }
                   System.out.println();
                   System.out.print(arr[i][j-1]+"   ");
                   System.out.print(arr[i][j+1]);
                   System.out.println();
                   for(int l = 1;l<=3;l++)
                   {
                       System.out.print(arr[i+1][l]+" ");
                   }
                   System.out.println();
                   
               }
           }
       }
    
    }
    
}
