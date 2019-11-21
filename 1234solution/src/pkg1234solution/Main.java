package pkg1234solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author JONIYED
 */
public class Main {
    public static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter out=new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        char[] arr;
        char[]arr1;
        arr=in.readLine().toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Character.toUpperCase(arr[i++]);
        }
        for(char x: arr)
        {
            System.out.print(x);
        }
        
        System.out.println("");
    }
    
}
