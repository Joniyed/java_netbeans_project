
package filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class FileReader {
        static BufferedReader reader;
        static PrintWriter writer;
        static Scanner jb;

    public static void main(String[] args) throws IOException {
        reader=new BufferedReader(new InputStreamReader(System.in));
        writer=new PrintWriter(System.out);
        jb=new Scanner(System.in);
        int n=jb.nextInt(),half,length;
        char[] M;
        String line;
        char temp;
        while(n-->0)
        {
            line=reader.readLine();
            M=line.toCharArray();
            length=M.length;
            half=length/2;
            for(int i=0;i<length;i++)
            {
                if(Character.isLetter(M[i]))
                {
                    M[i]=(char)((int) M[i]+3); 
                }
            }
            for(int i=0;i<half;i++)
            {
                temp=M[i];
                M[i]=M[M.length-i-1];
                M[M.length-i-1]=temp;
            }
            for(int i=half;i<length;i++)
            {
                M[i]=(char)((int)M[i]-1);
            }
            for(char x:M)
            {
                writer.print(x);
            }
            writer.println();
        }
        writer.close();
    }
}
