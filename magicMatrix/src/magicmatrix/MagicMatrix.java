/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicmatrix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class MagicMatrix {
     
       public static void main(String []args)
       {
           Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=input.nextInt();
     }
     int d=input.nextInt();
     int m=input.nextInt();
     int res=0,count=0;
     for(int i=0;i<n;i++)
     {
         for(int j=i;j<i+2;j++)
         {
             if(i==n-1)
             {
                 break;
             }
             else {
                 res+=arr[j];
             }
         }
         if(res==d)
         {
             count++;
         }
     }
           System.out.println(count);
    }
 }
