package time_in_word;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Time_in_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int h = in .nextInt();
        int m = in .nextInt();

    String total[] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
        "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one",
        "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight",
        "twenty nine"
    };
    String res = "";    
    if(m==0 || m==15 || m==45 || m==30)
    {
        switch(m)
        {
            case 0:
            {
                res = total[h] + " o' clock";
                break;
            }
            case 15:
            {
                res = "quarter past " + total[h];
                break;
            }
            case 30:
            {
                res = "half past " + total[h];
                break;
            }
            case 45:
            {
                res = "quarter to " + total[h + 1];
                break;
            }
        }
    }
    else {
            if(m==1)
            {
                res = total[m] + " minute past " + total[h];
            }
            else if (m < 30) 
            {
                res = total[m] + " minutes past " + total[h];
            }
            else
            {
                res = total[60 - m] + " minutes to " + total[h + 1];
            }
        }

    System.out.println(res);

  }
}
    
