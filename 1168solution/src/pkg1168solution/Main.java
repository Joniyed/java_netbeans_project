package pkg1168solution;

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
    
    public static void main(String[] args) throws IOException
    {
        
        int N=Integer.parseInt(in.readLine()),led=0;
        while(N-->0)
        {
            String l=in.readLine();
            char [] number=l.toCharArray();
            for(char x:number)
            {
                switch (x) {
                    case '1':
                        led+=2;
                        break;
                    case '2':
                    case '3':
                    case '5':
                        led+=5;
                        break;
                    case '4':
                        led+=4;
                        break;
                    case '6':
                    case '9':
                    case '0':
                        led+=6;
                        break;
                    case '7':
                        led+=3;
                        break;
                    case '8':
                        led+=7;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("Total led: "+ led);
            led=0;
        }
    }
    
}
