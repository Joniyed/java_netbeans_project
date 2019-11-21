package tagcontentextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JONIYED
 */
public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        while(n-->0)
        {
            String line=input.nextLine();
            Pattern r=  Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m=r.matcher(line);
            boolean jb=false;
            while(m.find())
            {
                System.out.println(m.group(2));
                jb=true;
            }
            if(!jb)
            {
                System.out.println("None");
            }
        }
    }
    
}
