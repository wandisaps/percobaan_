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
public class Person {
    private Job job;
    
    public Person(){
        this.job = new Job();
        job.setSalary(1000L);
        
    }
    public long getSalary(){
        return job.getSalary();
        
        
    }
    public static void main(String[] args) {
        Person person = new Person();
        
        long salary = person.getSalary();
        System.out.println(salary);
    }
}
  
