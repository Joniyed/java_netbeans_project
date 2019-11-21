package knapsackdp;

/**
 *
 * @author JONIYED
 */
public class KnapsackDP {
    
    public static int max(int a,int b){
        return (a>b)?a:b;
    }
    
    static int knpaSack(int W,int wt[],int val[],int n)
    {
        int i,w;
        int K[][]=new int[n+1][W+1];
        for(i=0;i<=n;i++)
        {
            for(w=0;w<=W;w++)
            {
                if(i==0 || w==0)
                {
                    K[i][w]=0;
                }
                else if(wt[i-1]<=w)
                {
                    K[i][w]=max(val[i-1]+K[i-1][w-wt[i-1]],K[i-1][w]);
                }
                else 
                {
                    K[i][w]=K[i-1][w];
                }
            }
        }
        for(i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                System.out.print(K[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        return K[n][W];
    }

    public static void main(String[] args) {
        int val[]=new int[]{6,1,12,3,4,5};
        int wt[]=new int[]{1,2,3,3,4,2};
        int W=7;
        int n=val.length;
        System.out.println(knpaSack(W,wt,val,n));
    }
    
}
