package javacomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
class Checker implements Comparator{
    @Override
    public int compare(Object o1, Object o2)
    {
        Player p1=(Player)o1;
        Player p2=(Player)o2;
        if(p1.score==p2.score)
        {
            return p1.name.compareTo(p2.name);
        }
        else if(p1.score<p2.score) return 1;
        else return -1;
    }
}


class Player{
    String name;
    int score;
    Player(String name, int score)
    {
        this.name=name;
        this.score=score;
    }
}

public class JavaComparator {
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Player player[]=new Player[n];
        for(int i=0;i<n;i++)
        {
            String name=input.next();
            int score=input.nextInt();
            player[i]=new Player(name,score);
        }
        Checker check=new Checker();
        Arrays.sort(player, check);
        for(int i=0;i<n;i++)
        {
            System.out.println(player[i].name+" "+ player[i].score);
        }
    }
    
}
