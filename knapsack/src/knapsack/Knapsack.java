
package knapsack;

import java.util.Scanner;

public class Knapsack extends merg
{
    
    public static double knapsack(double  weight[],double price[],double limit,int n)
    {
        double unitprice[]=new double[n];
        for(int i=0;i<n;i++)
        {
            unitprice[i]=(price[i]/weight[i]);
        }
        devide(weight,price,unitprice,0,n-1);
        double profit=0;
        for(int i=0;i<n;i++)
        {
            if(weight[i]<=limit)
            {
                   limit=limit-weight[i];
                   profit=profit+price[i];
            }
            else 
            {
                profit=profit+limit*unitprice[i];
                limit=0;
            }
        }
        return profit;
    }


    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many object : ");
        int n=input.nextInt();
        double weight[]=new double[n];
        double price[]=new double[n];
        System.out.println("Enter weight and price: ");
        for(int i=0;i<n;i++)
        {
            weight[i]=input.nextDouble();
            price[i]=input.nextDouble();
        }
        System.out.println("Enter weight limit : ");
        double  limit=input.nextDouble();
       System.out.println("Maximum profit : "+knapsack(weight,price,limit,n));
    }
    
}
