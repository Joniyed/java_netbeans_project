
package multiplication.namata;

import java.util.Scanner;

public class MultiplicationNamata {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt();
        if(n<2 || n>20)
        {
            System.out.println("Enter number  between 2 and 20");
            n=input.nextInt();
        }
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x " +i+" = "+(n*i));
        }
    }
    
}
