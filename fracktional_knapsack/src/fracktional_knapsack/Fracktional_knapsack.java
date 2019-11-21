
package fracktional_knapsack;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Fracktional_knapsack extends knapsack{
    
    public static void display(double weight[],double price[],double u_price[],int n)
    {
                System.out.println("Weight     Price    Unit Price");
                for(int i=0;i<n;i++)
                {
                    System.out.println(weight[i]+"        "+price[i]+"      " +u_price[i]);
                }
                System.out.println("");
                System.out.println("");
    }

    public static void main(String[] args) {
        merg jb=new merg();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter object size: ");
        int n=input.nextInt();
        System.out.println("Enter weight and price :");
        double weight[]=new double[n];
        double  price[]=new  double[n];
        double  u_price[]=new double[n];
        for(int i=0;i<n;i++)
        {
            weight[i]=input.nextDouble();
            price[i]=input.nextDouble();
            u_price[i]=price[i]/weight[i];
        }
        System.out.println("\n1.Using quick?\n2.Using merg.?\n");
        int choice=input.nextInt();
        switch(choice)
        {
            case 1:
            {
                      divide_quick(weight,price,u_price,0,n-1);
                      display(weight,price,u_price,n);
                      knapsack(weight,price,u_price,n);
                      break;
            }
            case 2:
            {
                jb.divide_merg(weight,price,u_price,0,n-1);
                display(weight,price,u_price,n);
                knapsack(weight,price,u_price,n);
                break;
            }
            default:
                break;
        }
    }
    
}
