/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author LAB313-PC22
 */
public class Dog extends Animal{
protected Dog(){
    super();
    System.out.println("I am a Dog");
    
}   
@Override
protected void eat(){
    super.eat();
    System.out.println("I eat dog food");
    
}
protected void bark(){
    System.out.println("I can bark");
}
}

class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        
        dog1.eat();
        dog1.bark();
    }
}

