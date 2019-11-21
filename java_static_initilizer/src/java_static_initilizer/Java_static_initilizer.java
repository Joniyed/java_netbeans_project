package java_static_initilizer;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Java_static_initilizer {
    
   private static boolean flag;
   private  static int B;
   private static int H;
      
    static
    {
        Scanner input=new Scanner(System.in);
        B=input.nextInt();
        H=input.nextInt();
        if(B<=0 || H<=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
        else flag=true;
    }

    public static void main(String[] args) {
           if(flag){
	int area=B*H;
	System.out.print(area);
           }
    }
    
}
