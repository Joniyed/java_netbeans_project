/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracktional_knapsack;

/**
 *
 * @author JONIYED
 */
public class quick extends merg{
     public static int quick(double weight[],double price[],double u_price[],int low, int high)
    {
        int i=low;
        double pivot=u_price[high],temp;
        for(int j=low;j<high;j++)
        {
            if(u_price[j]>pivot)
            {
                temp=u_price[i];
                u_price[i]=u_price[j];
                u_price[j]=temp;
                temp=weight[i];
                weight[i]=weight[j];
                weight[j]=temp;
                temp=price[i];
                price[i]=price[j];
                price[j]=temp;
                i++;
            }
        }
        temp=u_price[i];
        u_price[i]=u_price[high];
        u_price[high]=temp;
        temp=weight[i];
        weight[i]=weight[high];
        weight[high]=temp;
        temp=price[i];
        price[i]=price[high];
        price[high]=temp;
        return i;
    }
    
    public static void divide_quick(double weight[],double price[],double u_price[],int low,int high)
    {
        if(low<high)
        {
            int q=quick(weight,price,u_price,low,high);
            divide_quick(weight,price,u_price,low,q-1);
            divide_quick(weight,price,u_price,q+1,high);
        }
    }
    
}
