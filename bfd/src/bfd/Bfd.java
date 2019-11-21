package bfd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfd {
    static int V,E,S,D,j=0;
    static int graph[][]=new int[100][100];
    
    static void bfs()
    {
        int visited[]=new int[100];
        int colour[]=new int[100];
        int dist[]=new int[100];
        for(int i=0;i<colour.length;i++)
        {
            colour[i]=0;
            dist[i]=0;
        }
        Queue<Integer> arrV=new LinkedList<>();
        Queue<Integer> arrC=new LinkedList<>();
        arrV.add(S);
        arrC.add(0);
        colour[S]=1;
        visited[0]=S;
        while(!arrV.isEmpty() && !arrC.isEmpty())
        {
            int u=arrV.peek(),d=arrC.peek();
            visited[j]=u;
            j++;
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
        for(int i=0;i<V;i++)
        {
            System.out.println(visited[i]+" ("+dist[i+1]+")");
        }
        
        
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
