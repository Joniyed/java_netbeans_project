
package createseries;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Createseries {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int op=input.nextInt(),a,b,n,x=0,c=0;
        if(op<0 || op>500)
        {
            op=input.nextInt();
        }
        while(op>0)
        {
            op--;
            a=input.nextInt();
            b=input.nextInt();
            n=input.nextInt();
            if(a<0 || b<0 || a>500 || b>500 || n<1 || n>20)
            {
               a=input.nextInt();
               b=input.nextInt();
               n=input.nextInt();
            }
            int res=a;
                for(int i=1; ;i=i*2)
                {
                    x=i*b;
                    res+=x;
                    System.out.print(res+" "); 
                    c++;
                    if(c==n)
                    {
                        c=0;
                        break;
                    }
                }
                System.out.println("");
            }
        }
}

