
package stackexample;

import java.util.Stack;

/**
 *
 * @author JONIYED
 */
public class StackExample {
       
        public static boolean isBalanced(String expression)
        {
            Stack<Character> stack=new Stack<>();
            char[] chars=expression.toCharArray();
            
            for(char achar: chars)
            {
                if(stack.isEmpty())
                {
                    stack.push(achar);
                }
                else
                {
                    char peek=stack.peek();
                    if(peek=='(' && achar==')')
                    {
                        stack.pop(); 
                    }
                    else if(peek=='{' && achar=='}')
                    {
                        stack.pop();
                    }
                    else if(peek=='[' && achar==']')
                    {
                        stack.pop();
                    }
                    else
                    {
                         stack.push(achar);
                    }
                }
            }
            return stack.empty();
        }

    public static void main(String[] args) {
            String[] brackets={"(()){}()","({})","({}(","){})"};
            for(String expressions: brackets)
            {
                String isBalanced = isBalanced(expressions)?"Balanced": "Not balanced";
                System.out.println(expressions+" is "+ isBalanced);
            }
    }
    
}
