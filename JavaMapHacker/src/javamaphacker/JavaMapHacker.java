package javamaphacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JavaMapHacker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        Map<String, String> jb=new HashMap<>();
        int n=input.nextInt();
        input.nextLine();
        while(n-->0)
        {
            String name=input.nextLine();
            String num=input.nextLine();
            jb.put(name, num);
        }
        while(input.hasNext())
        {
            String s=input.nextLine();
            if(jb.containsKey(s))
            {
                System.out.println(s+"="+(jb.get(s)));
            }
            else System.out.println("Not found");
        }
    }
    
}
