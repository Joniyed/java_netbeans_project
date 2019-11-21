
package fracktional_knapsack;

public class merg {
    public void merg(double weight[],double price[],double u_price[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=1;
        double temp1[]=new double[100];
        double temp2[]=new double[100];
        double temp3[]=new double[100];
        while(i<=mid && j<=high)
        {
            if(u_price[i]>u_price[j])
            {
                temp1[k]=weight[i];
                temp2[k]=price[i];
                temp3[k]=u_price[i];
                k++;
                i++;
            }
            else
            {
                temp1[k]=weight[j];
                temp2[k]=price[j];
                temp3[k]=u_price[j];
                k++;
                j++;
            }
        }
        while(i<=mid)
        {
                temp1[k]=weight[i];
                temp2[k]=price[i];
                temp3[k]=u_price[i];
                k++;
                i++;
        }
        while(j<=high)
        {
                temp1[k]=weight[j];
                temp2[k]=price[j];
                temp3[k]=u_price[j];
                k++;
                j++;
        }
        for(i=low,k=1;i<=high;i++,k++)
        {
            weight[i]=temp1[k];
            price[i]=temp2[k];
            u_price[i]=temp3[k];
        }
    }
    
    
    public void divide_merg(double weight[],double price[],double u_price[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide_merg(weight,price,u_price,low,mid);
            divide_merg(weight,price,u_price,mid+1,high);
            merg(weight,price,u_price,low,mid,high);
        }
    }
}
