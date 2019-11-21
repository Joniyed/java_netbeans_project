package generic2;

/**
 *
 * @author JONIYED
 * @param <T>
 */
public class average  <T extends Number>{
    T[] nums;
    public average(T[] nums)
    {
        this.nums=nums;
    }
    
    double average()
    {
        double sum=0;
        for(T num: nums)
        {
            sum+=num.doubleValue();
        }
        return sum/nums.length;
    }
}
