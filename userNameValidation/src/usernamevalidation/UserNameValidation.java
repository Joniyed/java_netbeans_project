package usernamevalidation;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class UserNameValidation {
    class Validation{
        public static final String pattern="^[A-Za-z][A-Za-z0-9_]{7,29}$";
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        while(n-->0)
        {
            String userName=input.nextLine();
            if(userName.matches(Validation.pattern))
            {
                System.out.println("Valid");
            }
            else System.out.println("Invalid");
        }
    }
    
}
