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
public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("axis");
        Employee emp = new Employee("Neha");
        
        System.out.println(emp.getEmployeeName()+" Is Employee Of "+ bank.getBankName());
    }
}
