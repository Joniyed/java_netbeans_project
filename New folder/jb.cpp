#include <bits/stdc++.h>
using namespace std;

void Merge(int arr[],int low,int mid,int high)
{
    int temp[100];
    int i=low,j=mid+1,k=1;
    while(i<=mid && j<=high)
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

void divide(int arr[],int low,int high)
{
    if(low<high)
    {
        int mid = (low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        Merge(arr,low,mid,high);
    }
}

int main()
{
    int n,year,month,day;
    cin >> n ;
    int arr[n][3];
    int position[n];
    int age[n],temp[n];
    cout<<"Day: Month(30days): Year(365 Days)"<<"\n";
    for(int i=1;i<=n;i++)
    {
        position[i]=i;
        for(int j=1;j<=3;j++)
        {
            cin>>arr[i][j];
            if(j==1)
            {
                day=arr[i][j];
            }
            if(j==2)
            {
                month=arr[i][j]*30;
            }
            if(j==3)
            {
                year=arr[i][j]*365;
            }
        }
        age[i]=(year+month+day);
        temp[i]=age[i];
    }
    divide(age,1,n);

    cout<<"After Sorting"<<"\n";
    for(int i=1;i<=n;i=i+1)
    {
        for(int j=1;j<=n;j++)
            {
                if(age[i]==temp[j])
                {
                    cout<<(age[i]%365)%30<<" "<<(age[i]%365)/30<<" "<<age[i]/365<<" ";
                    cout<<" position was "<<position[j]<<"\n";
                    position[j]=0;
                    temp[j]=0;
                }

            }

    }
    return 0;
}
