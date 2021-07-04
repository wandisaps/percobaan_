/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LAB313-PC22
 */
public class Employee {
   int Id;
   String Name;
   int Age;
   long Salary;
   
   
  public  void setData(){
       Scanner sc = new Scanner (System.in);
       
       System.out.println("\n\tEnter Employee Id : ");
       Id = Integer.parseInt(sc.nextLine());
       
       System.out.println("\n\tEnter Employee Name");
       Name = sc.nextLine();
       
       System.out.println("\n\tEnter Employee Age");
       Age = Integer.parseInt(sc.nextLine());
       
       System.out.println("\n\tEnter Employee Salary");
       Salary = Integer.parseInt(sc.nextLine());
   }
    public void putData(){
       System.out.println("\n\t"+Id+Name+Age+"\t"+Salary);
   }
   
    public static void main(String[] args) {
        int n = 3;
        int i;
        
        Employee[] Emp = new Employee[n];
        
        for (int j = 0; j <n; j++) {
            Emp[j] = new Employee();
        }
        
        for (int j = 0; j < n; j++) {
            System.out.println("\n Enter details of "+(j+1)+"Employee\n");
            Emp[j].setData();
        }
        System.out.println("\nDetails of Employee\n");
        for (int j = 0; j < n; j++) {
            Emp[j].putData();  
        }
        System.out.println("\n");
    }
}
