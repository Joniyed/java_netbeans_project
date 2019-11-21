
package uva_problem;

import java.util.Scanner;

public class Uva_problem {

    public static void main(String[] args) {
     Scanner mk = new Scanner(System.in);
     int n,t,p = 0;
     n = mk.nextInt();
     
     String s = "";
     for(int l = 1;l<=n;l++)
     {
        
         t = mk.nextInt();
          char arr[] = new char[t+1];
         char ch[] = new char[t+1];
         String te1 = mk.next();
         for(int i = 0;i<t;i++)
         {
             ch[i] = te1.charAt(i);
             s +=ch[i];
         }
         String te ="" ;
         for(int i = s.length()-1;i>=0;i--)
         {
             te += s.charAt(i);
         }
         if(s.equalsIgnoreCase(te))
         {
             for(int i = 0;i<t;i++)
             {
                 int count = 0;
                 for(int j = i+1;j<t;j++)
                 {
                     
                     if(ch[i] == ch[j])
                     {
                         
                        for(int k = 0;k<t;k++)
                        {
                            if(ch[j]!=arr[k])
                            {
                                count++;
                                arr[k] = ch[j];
                            }
                        }
                         
                         
                         if(arr[i] !=ch[j])
                         {
                             count++;
                             arr[i] = ch[j];
                         }
                        
                             
                     }
                     
                 }
                 if(count!=0)
                     {
                         p++;
                     }
             }
            System.out.println("case "+l+": Parotum , "+p); 
         }else{
             System.out.println("case "+l+": No Parotum");}
         s = "";
         te = "";
         
     }
    }
    
}
