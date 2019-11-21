package generic;

/**
 *
 * @author JONIYED
 * @param <T>
 */
public class generictest <T>{
    private T obj;
    public generictest(T obj)
    {
        this.obj=obj;
    }
    public T getObj()
    {
        return obj;
    }
    public void showType()
    {
        System.out.println("Type of T is : "+obj.getClass().getName());
    }
}
