package generic2;

/**
 *
 * @author JONIYED
 * @param <T>
 */
public class Container <T> {
    
    private int MAX_LENGTH;
    
    private T[] items;
    private int currentIndex=0;
    public Container(int MAX_LENGTH)
    {
        this.MAX_LENGTH=MAX_LENGTH;
        items=(T[]) new Object[MAX_LENGTH];
    }
    public void addItems(T item)
    {
        if(currentIndex<MAX_LENGTH)
        {
            items[currentIndex++]=item;
        }
        else System.out.println("Container is full...");
    }
    
    public T getItem(int index)
    {
        if(index>MAX_LENGTH)
        {
            throw new IllegalArgumentException("Index can not be larger than max");
        }
        return items[index];
    }
    
    public void printall()
    {
        for(int i=0;i<currentIndex;i++)
        {
            System.out.print(items[i]+", ");
        }
    }
}
