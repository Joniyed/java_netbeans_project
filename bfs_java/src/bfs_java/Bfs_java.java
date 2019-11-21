
package bfs_java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Bfs_java {
    static int V,E,S,D;
    static int graph[][]=new int[100][100];
    
    public static void bfs()
    {
        int colour[]=new int[100];
        int dist[]=new int[100];
        Queue<Integer> arrV=new LinkedList<>();
        Queue<Integer> arrC=new LinkedList<>();
        arrV.add(S);
        arrC.add(0);
        colour[S]=1;
        while(!arrV.isEmpty() && !arrC.isEmpty())
        {
            int u=arrV.peek(),d=arrC.peek();
            arrV.remove();
            arrC.remove();
            dist[u]=d;
            if(u==1)
                System.out.println("Dhaka"+"("+d+")");
            else if(u==2)
                System.out.println("B baria"+"("+d+")");
            else if(u==3)
                 System.out.println("Comilla"+"("+d+")");
            else if(u==4)
                System.out.println("Rajshahi"+"("+d+")");
            else System.out.println("Rangpur: "+"("+d+")");
            for(int i=1;i<=V;i++)
            {
                if(colour[i]==0 && graph[u][i]==1)
                {
                    arrV.add(i);
                    arrC.add(d+1);
                    colour[i]=1;
                }
            }
        }
        System.out.println("DISTANCE: "+dist[D]);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        V=input.nextInt();
        E=input.nextInt();
        for(int i=1;i<=E;i++)
        {
            int u=input.nextInt(),v=input.nextInt();
            graph[u][v]=graph[v][u]=1;
        }
        S=input.nextInt();
        D=input.nextInt();
        bfs();
    }
    
}
