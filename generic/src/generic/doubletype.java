package generic;

/**
 *
 * @author JONIYED
 * @param <X>
 * @param <Y>
 */
public class doubletype <X,Y> {
    private X x;
    private Y y;
    
    public doubletype(X x,Y y)
    {
        this.x=x;
        this.y=y;
    }
    public X getX()
    {
        return x;
    }
    public Y getY()
    {
        return y;
    }
    public void show()
    {
        System.out.println("Type of T is : "+ x.getClass().getName()+" Value: "+x);
        System.out.println("Type of V is: "+y.getClass().getName()+"  Valye: "+y);
    }
}
