package lisa.sworkbook;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class LisaSWorkbook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int page=0,flag=0,res=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
                flag++;
                if(flag==k){
                    page++;
                }
                if(j==page)
                {
                    res++;
                }
            }
        }
    }
    
}
