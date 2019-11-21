package fracktional_knapsack;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class knapsack extends quick{
    public static void knapsack(double weight[],double price[],double u_price[],int n)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter weight limit: ");
        double w=input.nextInt();
        double p=0;
        for(int i=0;i<n;i++)
        {
            if(weight[i]<=w)
            {
                p=p+price[i];
                w=w-weight[i];
            }
            else 
            {
                p=p+w*u_price[i];
                w=0;
            }
        }
        System.out.println("Max profit can be : "+p);
    }
}
