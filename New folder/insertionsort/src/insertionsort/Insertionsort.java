
package insertionsort;
import java.util.*;

public class Insertionsort 
{
    public int isSorted(int size, int arr[])
    {
        if(size<=1)
            return 1;
        if(arr[size-1]>=arr[size-2])
            return isSorted(size-1,arr);
        else return 0;
    }

    public static void main(String[] args) 
    {
        Insertionsort jb=new Insertionsort();
        Scanner input=new Scanner(System.in);
        int size=input.nextInt(),temp,j,step=0;
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=input.nextInt();
        }
        for(int i=1;i<a.length;i++)
        {
            step+=i;
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
            if(jb.isSorted(size,a)==1)
                break;
        }
        System.out.println("Total Step: "+step);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    
}
