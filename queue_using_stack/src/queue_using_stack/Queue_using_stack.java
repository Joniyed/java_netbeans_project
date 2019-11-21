/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_using_stack;

import java.util.Scanner;

/**
 *
 * @author JONIYED
 */
public class Queue_using_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         stacks_for_queue jb=new stacks_for_queue();
         int choice;
         do{
             System.out.println("1.Insert\n2.Remove\n3.Peek\n4.Size\n5.Display");
             choice=input.nextInt();
             switch(choice)
             {
                 case 1:
                 {
                     System.out.println("Enter number for insert: ");
                     int num=input.nextInt();
                     jb.insert(num);
                     System.out.println("Pushed: "+num);
                     break;
                 }
                 
                 case 2: 
                 {
                     System.out.println("Remove : "+jb.remove());
                     break;
                 }
                 case 3: 
                 {
                     System.out.println("Peek element is : "+jb.peek());
                     break;
                 }
                 case 4:
                 {
                     System.out.println("Size: "+jb.getSize());
                     break;
                 }
                 case 5:
                 {
                     jb.display();
                     break;
                 }
                 default:
                     break;
             }
         }while(choice<10);
    }
    
}
