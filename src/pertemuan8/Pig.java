/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author user
 */
public class Pig implements Animals{
    @Override
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    @Override
    public void sleep(){
        System.out.println("Zzz");
    }
}
