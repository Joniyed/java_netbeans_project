package abstraction;

/**
 *
 * @author JONIYED
 */
public class triangle extends shape {
    triangle(double base,double height)
    {
        super(base,height);
    }
    @Override
     void area()
    {
        double result= 0.5 * x * y; 
        System.out.println("Area of Triagnle: "+result);
    }
}
