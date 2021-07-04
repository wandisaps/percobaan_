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
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        
        b1.setTitle("Harry Potter and The Goblet of Fire");
        b1.setAuthor("JK Rowling");
        
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        
        b1.tampilInfo();
    }
}
