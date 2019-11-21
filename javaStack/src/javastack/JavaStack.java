package javastack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author JONIYED
 */
public class JavaStack {
    
    static boolean check(String jb)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<jb.length();i++)
        {
            char a=jb.charAt(i);
            if(a=='('||a=='{'||a=='[')
            {
                stack.add(a);
            }
            else if(stack.isEmpty())
            {
                return false;
            }
            else {
                char top=stack.pop();
                if(top=='(' && a!=')' || top=='{' && a!='}' || top=='[' && a!=']'){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext())
        {
            System.out.println(check(input.nextLine()));
        }
    }
}
