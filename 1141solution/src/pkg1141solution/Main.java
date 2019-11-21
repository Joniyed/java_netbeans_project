package pkg1141solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author JONIYED
 */
public class Main {
    
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(System.out);
    

    public static void main(String[] args)  throws IOException
    {
        String [] l={};
        String jb="",res;
        int N=Integer.parseInt(in.readLine());
        while(N-->0)
        {
            for(String x:l)
            {
                jb=x;
            }
            res=jb+in.readLine()+" ";
            l=res.split("\n");
        }
        for(String x:l)
        {
            System.out.println(x+"\n");
        }
        
    }
    
}
