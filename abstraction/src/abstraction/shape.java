
package abstraction;

/**
 *
 * @author JONIYED
 */
public abstract class shape {
    double x,y;
    shape(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    abstract void area();
}
