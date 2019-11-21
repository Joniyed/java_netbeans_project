
package abstraction;

/**
 *
 * @author JONIYED
 */
public class Abstraction {

    public static void main(String[] args) {
        shape s;
        s=new triangle(10,10);
        s.area();
        s=new circle(1);
        s.area();
        s=new ractangle(10,10);
        s.area();
    }
    
}
