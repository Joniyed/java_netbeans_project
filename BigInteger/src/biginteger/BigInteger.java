
package biginteger;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class BigInteger {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        java.math.BigInteger a=new java.math.BigInteger(input.nextLine());
        java.math.BigInteger b=new java.math.BigInteger(input.nextLine());
        java.math.BigInteger s= java.math.BigInteger.valueOf(0);
        java.math.BigInteger p;
        s=s.add(a);
        s=s.add(b);
        p=a.multiply(b);
        System.out.println(s);
        System.out.println(p);
    }
    
}
