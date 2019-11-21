
package multiplication;

import java.util.Scanner;



public class Multiplication {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[2][3];
        int first=0,second=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=input.nextInt();
                if(i==0)
                {
                     switch(j)
                    {
                        case 0: 
                            first+=arr[i][j]*30;
                            break;
                        case 1:
                            first+=arr[i][j];
                            break;
                        case 2:
                            first+=arr[i][j]*365;
                     }
                }
                else
                {
                    switch(j)
                    {
                        case 0: 
                            second+=arr[i][j]*30;
                            break;
                        case 1:
                            second+=arr[i][j];
                            break;
                        case 2:
                            second+=arr[i][j]*365;
                    }
                }
            }
        }
        System.out.println((Math.abs(first-second))+" days");
    }
    
}
