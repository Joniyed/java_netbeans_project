
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONIYED
 */
public class Arraylist {

    public static void main(String[] args) { 
        List<String> jb=new ArrayList<>();
        
        jb.add("Nahid");
        jb.add("Arif");
        jb.add("Juwel");
        
        System.out.println("Total: "+ jb);
        System.out.println("Size: "+jb.size());
        
        System.out.println("Second : "+jb.get(2));
        jb.set(1, "Md joniyed bhuiyan ");
        System.out.println(jb);
        jb.remove(1);
        System.out.println(jb);
        jb.add("Brahmanbaria");
        System.out.println(jb);
    }
    
}
