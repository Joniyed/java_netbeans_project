package extralongfact;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class ExtraLongFact {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        BigInteger res=new BigInteger("1");
        for(int i=n;i>0;i--)
        {
            res=res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
    
}
