
package queue_using_stack;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *
 * @author JONIYED
 */
public class stacks_for_queue {
    Stack <Integer> stack1;
    Stack <Integer> stack2;
    
    public stacks_for_queue()
    {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void insert(int data)
    {
        if(stack1.isEmpty())
        {
            stack1.push(data);
        }
        else
        {
            int l=stack1.size();
            for(int i=0;i<l;i++)
            {
                stack2.push(stack1.pop());
                System.out.println(stack2);
            }
            stack1.push(data);
            for(int i=0;i<l;i++)
            {
                stack1.push(stack2.pop());
            }
        }
    }
    public int remove()
    {
        if(stack1.isEmpty())
        {
            throw new NoSuchElementException("Underflow Exception");
        }
        return stack1.pop();
    }
    public int peek()
    {
        if(stack1.isEmpty())
        {
            throw new NoSuchElementException("Underflow Exception");
        }
        return stack1.peek();
    }
    public boolean isEmpty()
    {
        return stack1.isEmpty();
    }
    public int getSize()
    {
        return stack1.size();
    }
    
    public void display()
    {
        System.out.println("Queue is : ");
        int l=getSize();
        if(l==0)
        {
            System.out.println("Empty...");
        }
        else
        {
            for(int i=l-1;i>=0;i--)
            {
                System.out.println(stack1.get(i)+" ");
            }
            System.out.println(" ");
        }
    }
    
    
}
