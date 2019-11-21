
package allsort;

public class merg extends quick
{
    public static void merg(int arr[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=1;
        int temp[]=new int[100];
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(i=low,k=1;i<=high;i++,k++)
        {
            arr[i]=temp[k];
        }
    }
    public static void divide_m(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide_m(arr,low,mid);
            divide_m(arr,mid+1,high);
            merg(arr,low,mid,high);
        }
    }
}
