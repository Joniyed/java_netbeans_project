package bon_appetit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Bon_appetit {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int item=input.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int value=input.nextInt();
            arr.add(value);
        }
        int price=input.nextInt();
        arr.remove(item);
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
        }
        int res=price-(sum/2);
        if(res==0)
        {
            
        }
    }
    
}
