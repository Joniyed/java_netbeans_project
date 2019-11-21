
package java_list;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Java_List {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        LinkedList<Integer> List=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            int value=input.nextInt();
            List.add(value);
        }
        int q=input.nextInt();
        for(int i=0;i<q;i++)
        {
            String jb=input.next();
            if(jb.matches("Insert"))
            {
                int x=input.nextInt();
                int y=input.nextInt();
                List.add(x, y);
            }
            else if(jb.matches("Delete"))
            {
                int z=input.nextInt();
                List.remove(z);
            }
        }
        for(int x: List)
        {
            System.out.print(x+" ");
        }
    }
    
}
