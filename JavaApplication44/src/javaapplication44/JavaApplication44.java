
package javaapplication44;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class JavaApplication44 {
    

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        
        int max=0;
        int num[]=new int[25];
        int k=5;
        for(int i=0;i<25;i++)
        {
            num[i]=35+k;
            k=k+5;
        }
        
        System.out.println("");
        System.out.println("");
        for(int i=0;i<n;i++)
        {
           if(a[i]<38)
           {
               System.out.println(a[i]);
           }
           else{
                for(int j=0;j<num.length;j++)
                {
                    if(a[i]==num[j])
                    {
                        max=num[j];
                        break;
                    }
                    else if(num[j]>a[i])
                    {
                        max=num[j];
                        break;
                    }
                }
                if(max-a[i]<3)
                {
                    System.out.println(max+"");
                }
                else if(max-a[i]==3)
                {
                    System.out.println(a[i]+"");
                }
                else if(max-a[i]==0)
                {
                    System.out.println(a[i]+"");
                }
                else System.out.println(a[i]+"");
            
            }
        }
          
        }
    }

