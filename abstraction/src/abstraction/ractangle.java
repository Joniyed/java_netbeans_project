package abstraction;

/**
 *
 * @author JONIYED
 */
public class ractangle extends shape {
    
    ractangle(double length,double width)
    {
        super(length,width);
    }
    
    @Override
    void area()
    {
        double result=x*y;
        System.out.println("Area of Ractangle: "+result);
    }    
    
}
