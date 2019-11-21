package substring;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Substring {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String jb=input.next();
        int start=input.nextInt();
        int end=input.nextInt();
        System.out.println(jb.substring(start, end));
    }
    
}
