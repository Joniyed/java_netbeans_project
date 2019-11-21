package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Bfs {
    static int S,V,E,D;
    static int graph[][]=new int[100][100];
    
    
    static void bfs()
    {
        Queue <Integer>arrV=new LinkedList<>();
        Queue <Integer>arrC=new LinkedList<>();
        int colour[]=new int [100];
        int dist[]=new int[100];
        for(int i=0;i<colour.length;i++)
        {
            colour[i]=0;
            dist[i]=0;
        }
        arrV.add(S);
        arrC.add(0);
        colour[S]=1;
        while(!arrV.isEmpty() && !arrC.isEmpty())
        {
            int u=arrV.element();
            int d=arrC.element();
            arrV.remove();
            arrC.remove();
            dist[u]=d;
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
        System.out.println("Distance: "+dist[D]);
       
    }
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        V=input.nextInt();
        E=input.nextInt();
        for(int i=1;i<=E;i++)
        {
            int u,v;
            u=input.nextInt();
            v=input.nextInt();
            graph[u][v]=graph[v][u]=1;
        }
        S=input.nextInt();
        D=input.nextInt();
        bfs();
    }
    
}
