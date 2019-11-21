package generic;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Generic {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String jb1=input.nextLine();
        
        
        generictest <Integer> iobj=new generictest<> (33);
        iobj.showType();
        int v=iobj.getObj();
        System.out.println("Value: "+v);
        
        
        
        generictest <String> iobj1=new generictest<> (jb1);
        iobj1.showType();
        String jb=iobj1.getObj();
        System.out.println("Value: "+jb);
        
        
        doubletype<Integer,String> dobj=new doubletype<>(88,jb1);
        System.out.println("Main class: "+dobj.getX()+" "+dobj.getY());
        dobj.show();
    }
    
}
