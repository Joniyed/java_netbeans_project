package generic2;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Generic2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        
        Container<Integer> jb=new Container<>(N);
        
        
        for(int i=1;i<=N;i++)
        {
            jb.addItems(i);
        }
        
        jb.printall();
        System.out.println("Index: "+jb.getItem(N-1));
        int nums=4;
        int num=6;
        average<Integer> j;
       // j.average();
    }
    
}
