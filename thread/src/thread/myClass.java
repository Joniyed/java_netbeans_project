/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author JONIYED
 */
public class myClass implements myInterface {
    myClass()
    {
        System.out.println("This is my constructor");
    }

    @Override
    public void myMethod() {
        System.out.println("Mymethod");
    }

    @Override
    public void myName() {
        System.out.println("MyName");
    }

    @Override
    public void show() {
        System.out.println("Show");
    }
}
