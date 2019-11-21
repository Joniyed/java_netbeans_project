
package sorol_math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Sorol_math {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        String a[]=str.split("[+-/*]");
        String b[]=str.split("[0-9]+");
        List<String> math=new ArrayList<>();
        int j=1;
        for(int i=0;i<a.length;i++)
        {
            math.add(a[i]);
            math.add(b[j]);
            j++;
            if(j==b.length)
            {
                j=0;
            }
        }
        int x,y,r;
        for(int i=0;i<math.size();i++)
        {
            if("/".equals(math.get(i)))
            {
                x=Integer.parseInt(math.get(i-1));
                y=Integer.parseInt(math.get(i+1));
                r=x/y;
                math.remove(i);
                math.remove(i);
                math.remove(i-1);
                math.add(i-1,(r+""));
            }
        }
        for(int i=0;i<math.size();i++)
        {
            if("*".equals(math.get(i)))
            {
                x=Integer.parseInt(math.get(i-1));
                y=Integer.parseInt(math.get(i+1));
                r=x*y;
                math.remove(i);
                math.remove(i);
                math.remove(i-1);
                math.add(i-1,(r+""));
            }
        }
        int sum=Integer.parseInt(math.get(0));
        for(int i=1;i<math.size();i++)
        {
            if(math.get(i).compareTo("+")==0)
            {
                int z=Integer.parseInt(math.get(i+1));
                sum+=z;
            }
            else if(math.get(i).equals("-"))
            {
                int z=Integer.parseInt(math.get(i+1));
                sum-=z;
            }
        }
        System.out.println(sum);
    }
    
}
