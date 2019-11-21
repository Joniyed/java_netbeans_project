
package service_line;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Service_Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int t=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        
        int cases[][]=new int[t][2];
        
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<2;j++)
            {
                cases[i][j]=input.nextInt();
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            int a=cases[i][0];
            int b=cases[i][1];
            int min=arr[a];
            for(int k=a+1;k<=b;k++)
            {
                if(min>arr[k])
                {
                    min=arr[k];
                }
            }
            System.out.println(min);
        }
    }
    
}
