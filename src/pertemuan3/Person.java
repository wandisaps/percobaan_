/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author LAB313-PC22
 */
class Person {
    private int age;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class Main{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(24);
        System.out.println("My age is " + p1.getAge());
    }
}
