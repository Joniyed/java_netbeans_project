
package age_sort;

import java.util.Scanner;


public class Age_sort extends quick{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter people list size: ");
        int n=input.nextInt(),hour=0;
        int total[]=new int[n];
        int temp[]=new int[n];
        System.out.println("Enter hour------day-----month--------year: ");
        int arr[][]=new int[n][4];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=input.nextInt();
                switch (j) {
                    case 0:
                        hour+=arr[i][j];
                        break;
                    case 1:
                        hour+=arr[i][j]*24;
                        break;
                    case 2:
                        hour+=arr[i][j]*30*24;
                        break;
                    case 3:
                        hour+=arr[i][j]*365*24;
                        break;
                    default:
                        break;
                }
            }
            total[i]=hour;
            temp[i]=total[i];
            hour=0;
        }
        
        divide(total,0,n-1);
        System.out.println("After sorting : ");
        for(int i=0;i<n;i++)
        {
           
        }
//        
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<4;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
    
}
