
package age_sort;


public class quick {
    public static int quick(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low;
        for(int j=low;j<high;j++)
        {
            if(arr[j]>pivot)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void divide(int arr[],int low,int high)
    {
        if(low<high)
        {
            int q=quick(arr,low,high);
            divide(arr,low,q-1);
            divide(arr,q+1,high);
        }
    }
}
