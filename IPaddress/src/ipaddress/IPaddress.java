
package ipaddress;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class IPaddress {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext())
        {
            String IP=input.next();
            MyRegex jb=new MyRegex();
            boolean res=IP.matches(jb.pattern);
            System.out.println(res);
        }
    }
    
}
class MyRegex{
    String pattern;
    MyRegex(){
        String validip="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        pattern=validip+"."+validip+"."+validip+"."+validip;
    }
}
