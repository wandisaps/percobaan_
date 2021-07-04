/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author user
 */
public class StudentClass {
   int rollNum;
   String studentName;
   
   Adress studentAddr;
   StudentClass(int roll, String name, Adress addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr=addr;
   }
    public static void main(String[] args) {
        Adress ad = new Adress(55,"Agra","UP","INDIA");
        StudentClass obj = new StudentClass(123, "Chaitanya", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
        
        
    }
}
