package encryption1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JONIYED
 */
public class Encryption1 {

    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,half,length;
        char[] m = null;
        char temp;
        N=input.nextInt();
        while(N-->0)
        {
            try 
            {
                m=in.readLine().toCharArray();
            }
            catch (IOException ex) 
            {
                Logger.getLogger(Encryption1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        length=m.length;
        half=length/2;
        
    }
    
}
