package javabigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class JavaBigdecimal {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String [] s=new String[n];
        BigDecimal a[] = new BigDecimal[n];
        BigDecimal temp1[]=new BigDecimal[n];
        for(int i=0;i<n;i++)
        {
            s[i]=input.next();
            a[i]=new BigDecimal((s[i]));
            temp1[i]=new BigDecimal(s[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])==-1)
                {
                    BigDecimal temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        String t1[]=new String[n];
        System.out.println("");
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i].compareTo(temp1[j])==0)
                {
                    t1[k]=s[j];
                    k++;
                    int t=-100000+i;
                    temp1[j]=new BigDecimal(t);
                    break;
                }
            }
        }
      for(int i=0;i<n;i++)
      {
          s[i]=t1[i];
      }
      for(String x:s)
      {
          System.out.println(x);
      }
    }    
}
