
package margatorybird;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class MargatoryBird {
    static int migratoryBirds(List<Integer> arr) {
        List<Integer> temp=new ArrayList<>();
        List<Integer> temp1=new ArrayList<>();
        int count=0;
        temp.add(arr.get(0));
        for(int i=0;i<arr.size();i++)
        {
            int a=arr.get(i);
            for(int j=0;j<temp.size();j++)
            {
                if(temp.get(j)==a)
                {
                    count++;
                }
            }
            if(count<1)
            {
                temp.add(a);
            }
            else{
                count=0;
            }
        }
        int c=0;
        for(int i=0;i<temp.size();i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                int a=temp.get(i);
                if(a==arr.get(j))
                {
                    c++;
                }
            }
            temp1.add(c);
            c=0;
        }
        int max=temp1.get(0);
        int item=temp.get(0);
        for(int i=1;i<temp1.size();i++)
        {
            if(max<temp1.get(i)){
                 max=temp1.get(i);
                 item=temp.get(i);
            }
            else if(max==temp1.get(i))
            {
                if(item>temp.get(i))
                {
                    item=temp.get(i);
                }
            }
        }
        return item;
    }

    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int value=input.nextInt();
            arr.add(value);
        }
        int res=migratoryBirds(arr);
        System.out.println(res);
    }
    
}
