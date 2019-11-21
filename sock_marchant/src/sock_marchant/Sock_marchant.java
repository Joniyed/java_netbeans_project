package sock_marchant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Sock_marchant {
    static int sockMerchant(int n, int[] ar) {
        int count=0,sum=0,k=0;
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=ar[i];
            temp.add(a);
            for(int j=0;j<temp.size();j++)
            {
                if(temp.get(j)==a)
                {
                   k++; 
                }
            }
            if(k==1)
            {
                for(int j=0;j<n;j++)
                {
                    if(a==ar[j])
                    {
                        count++;
                    }
                }
                k=0;
            }
            else k=0;
            sum+=count/2;
            count=0;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=input.nextInt();
        }
        System.out.println(sockMerchant(n,ar));
    }
    
}