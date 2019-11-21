
package javaapplication4;

public class JavaApplication4 {
    public void show()
    {
       int a=10,b;
       for(int i=10;i>=0;i--)
       {
           b=a/i;
           System.out.println(b);
       }
       System.out.println("enter the valu....");
    }
    public static void main(String[] args) {
        
       JavaApplication4 mk = new JavaApplication4();
try{
       mk.show();
}
catch (Exception ex)
{
System.out.print("hall...");
}
    }
           
}
