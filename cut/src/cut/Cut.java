
package cut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Cut {

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
        int count=0;
        List<Integer> res=new ArrayList<>();
        while(flag!=0)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=0)
                {
                    count++;
                }
            }
            res.add(count);
            count=0;
            int min=99999;
            for(int j=0;j<n;j++)
            {
                if(arr[j]!=0 && arr[j]<min)
                {
                    min=arr[j];
                    flag=1;
                }
                if(min==99999) flag=0;
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    
                }
                else arr[i]=arr[i]-min;
            }
        }
        for(int i=0;i<res.size();i++)
        {
            if(res.get(i)==0)
            {
                
            }
            else System.out.println(res.get(i));
        }
    }
    
}
