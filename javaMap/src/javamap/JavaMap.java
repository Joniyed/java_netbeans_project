package javamap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class JavaMap {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        HashMap jb=new HashMap();
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            String name=input.next();
            String num=input.next();
            String all=name+"="+num;
            jb.put(i, all);
        }
        int    q=input.nextInt();
        for(int i=0;i<q;i++)
        {
            String check=input.next();
            String name=jb.get(i).toString();
            String [] fullname=name.split("=");
            if(check.matches(fullname[0]))
            {
                System.out.println(jb.get(i).toString());
            }
            else System.out.println("Not found");
        }
    }
    
}
