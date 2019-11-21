
package abstract_merg;

public class merg extends abstracts {
    
    @Override
    public void merg(int arr[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=0;
        int temp[]=new int[100];
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            else {
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
            temp[j]=arr[j];
            j++;
            k++;
        }
        for(i=low,k=0;i<=high;i++,k++)
        {
            arr[i]=temp[k];
        }
    }
    @Override
    public void devide(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            devide(arr,low,mid);
            devide(arr,mid+1,high);
            merg(arr,low,mid,high);
        }
    }
}
