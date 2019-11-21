package equlizing_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Equlizing_array {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(input.nextInt());
        }
        int max=0,count=0;
        for(int i=0;i<arr.size();i++)
        {
            int a=arr.get(i);
            for(int j=0;j<arr.size();j++)
            {
                int b=arr.get(j);
                if(a==b)
                {
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
            count=0;
        }
        System.out.println(n-max);
     
    }
    
}
