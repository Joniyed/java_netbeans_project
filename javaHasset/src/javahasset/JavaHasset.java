
package javahasset;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class JavaHasset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      String [] first=new String[n];
      String [] second=new String[n];
      for(int i=0;i<n;i++)
      {
          first[i]=input.next();
          second[i]=input.next();
      }
      HashSet <String> set=new HashSet<>(n);
      for(int i=0;i<n;i++)
      {
          set.add(first[i]+" "+second[i]);
          System.out.println(set.size());
      }
    }
    
}
