
package minimum_distance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Minimum_distance {

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
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=arr[i];
            if(i==n-1)
            {
                break;
            }
            else
            {
                for(int j=i+1;j<n;j++)
                {
                    int b=arr[j];
                    if(a==b)
                    {
                        res.add(Math.abs(j-i));
                        break;  
                    }
                }   
            }
        }
        int count=-1;
        if(!res.isEmpty())
        {   
            count=res.get(0);
            for(int i=1;i<res.size();i++)
            {
                if(res.get(i)<count)
                {
                    count=res.get(i);
                }
            }
        }
        System.out.println(count);
    }
    
}
