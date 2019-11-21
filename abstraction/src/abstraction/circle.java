package abstraction;

/**
 *
 * @author JONIYED
 */
public class circle extends shape {
    circle(double r)
    {
        super(r,r);
    }
    @Override
    void area()
    {
        double result=Math.PI * Math.pow(x,2);
        System.out.println("Area of Circle : "+result );
    }
}
