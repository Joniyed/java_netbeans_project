package sequence_equation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Sequence_equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n+1];
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==arr[j])
                {
                   for(int k=1;k<=n;k++)
                   {
                       if(j==arr[k])
                       {
                           res.add(k);
                       }
                   }
                }
            }
        }

        for(Integer x:res)
        {
            System.out.println(x);
        }
        
    }
    
    
}
