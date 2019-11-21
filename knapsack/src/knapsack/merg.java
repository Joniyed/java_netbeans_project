
package knapsack;

public class merg {
    public static void mergsort(double weight[],double price[],double unitprice[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=1;
        double temp1[]=new double[100];
        double temp2[]=new double[100];
        double temp3[]=new double[100];
        while(i<=mid && j<=high)
        {
            if(unitprice[i]>unitprice[j])
            {
                temp1[k]=weight[i];
                temp2[k]=price[i];
                temp3[k]=unitprice[i];
                k++;
                i++;
            }
            else
            {
                temp1[k]=weight[j];
                temp2[k]=price[j];
                temp3[k]=unitprice[j];
                k++;
                j++;
            }
        }
        while(i<=mid)
        {
                temp1[k]=weight[i];
                temp2[k]=price[i];
                temp3[k]=unitprice[i];
                k++;
                i++;
        }
        while(j<=high)
        {
                temp1[k]=weight[j];
                temp2[k]=price[j];
                temp3[k]=unitprice[j];
                k++;
                j++;
        }
        for(i=low,k=1;i<=high;i++,k++)
        {
            weight[i]=temp1[k];
            price[i]=temp2[k];
            unitprice[i]=temp3[k];
        }
    }
    
    public static void devide(double weight[],double price[],double unitprice[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            devide(weight,price,unitprice,low,mid);
            devide(weight,price,unitprice,mid+1,high);
            mergsort(weight,price,unitprice,low,mid,high);
        }
    }
}
