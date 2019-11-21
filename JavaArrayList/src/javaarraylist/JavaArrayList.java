package javaarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class JavaArrayList {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<List<Integer>> lines=new ArrayList<List<Integer>>();
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            List<Integer> line=new ArrayList<Integer>();
            int size=input.nextInt();
            for(int j=0;j<size;j++)
            {
                line.add(input.nextInt());
            }
            lines.add(line);
        }
        int query=input.nextInt();
        for(int i=0;i<query;i++)
        {
            int x=input.nextInt();
            int y=input.nextInt();
            if(y>lines.get(x-1).size())
            {
                System.out.println("ERROR!");
            }
            else{
                System.out.println(lines.get(x-1).get(y-1));
            }
        }
    }
    
}
