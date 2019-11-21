package fire_ration;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Fire_ration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int flag=1;
        while(flag==1)
        {
            for(int k=0;k<n;k++)
            {
                if(arr[k]%2==0)
                {
                    flag=0;
                }
                else 
                {
                    flag=1;
                    break;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==1)
                {
                    if(i<n-1 && i==0)
                    {
                        if(arr[i+1]%2==1)
                        {
                            arr[i]=arr[i]+1;
                            arr[i+1]++;
                        }      
                    }
                }
                else {
                    if(i>0)
                    {
                        arr[i]=arr[i]+1;
                        arr[i-1]=arr[i-1]+1;
                    }
                }
            }
        }
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
    
}
