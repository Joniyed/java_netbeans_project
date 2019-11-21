
package mergesort;

import java.util.Scanner;

public class Mergesort {
    
    public void merge(int arr[],int low,int mid,int high)
    {
        int temp[]=new int[arr.length];
        int i=low,j=mid+1,k=1;
        while(i<=low && j<=high)
        {
            if(arr[i]>arr[j])
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
   
    public void divide(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            divide(arr,low,mid);
            divide(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }


    public static void main(String[] args) {
        Mergesort jb=new Mergesort();
        Scanner input=new Scanner(System.in);
        int size=input.nextInt(),day=0,month=0,year=0;
        int arr[][]=new int[size+1][4];
        int age[]=new int[size+1];
        int position[]=new int[size+1];
        int temp[]=new int[size+1];
        for(int i=1;i<=size;i++)
        {
            position[i]=i;
            for(int j=1;j<=3;j++)
            {
                arr[i][j]=input.nextInt();
                if(j==1)
                {
                    day=arr[i][j];
                }
                if(j==2)
                    month=arr[i][j];
                if(j==3)
                    year=arr[i][j];
            }
            age[i]=day+month*30+year*365;
            temp[i]=age[i];
           // arr[i]=input.nextInt();
        }
        jb.divide(age,1,size);
        
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(age[i]==temp[j])
                {
                    System.out.print((age[i]%365)%30+" "+(age[i]%365)/30+" "+age[i]/365+"Postion was"+position[j]+"\n");
                    position[j]=0;
                    temp[j]=0;
                }
            }
        }
    
    }
}