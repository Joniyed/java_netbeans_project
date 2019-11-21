package caeser_cipher;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Caeser_cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int k=input.nextInt();
        
        
        k=k%26;
        char arr[]=s.toCharArray();
        int test,test1;
        for(int i=0;i<arr.length;i++)
        {
            test1=arr[i];
            test=test1;
            if(test1<91 && test1>64)
            {
                test=test1+k;
                if(test>90)
                {
                    test=(test%90)+64;
                    arr[i]=(char)test;
                }
                else{
                    arr[i]=(char)test;
                }
                
            }
            if(test1<123 && test1>96)
            {
                test=test1+k;
                if(test>122)
                {
                    test=(test%122)+96;
                    arr[i]=(char)test;
                }
                else{
                    arr[i]=(char)test;
                }
                
            }
            
           
        }
        String res=new String(arr);
        System.out.println(res);
    }
    
}
