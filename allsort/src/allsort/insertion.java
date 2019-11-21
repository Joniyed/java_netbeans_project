package allsort;

public class insertion extends merg
{
    public static void insertion_s(int arr[],int n)
    {
        int i=0,x,j;
        while(i<=n)
        {
            x=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>x)
            {
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=x;
            i++;
        }
    }
}
