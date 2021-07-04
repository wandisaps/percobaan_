/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author LAB313-PC22
 */
public class TestEmployee {
    public static void main(String[] args) {
        int n=2;
        int i;
        
        Employee1 emp[] = new Employee1[n];
        
        for (int j = 0; j <n; j++) {
            emp[j] = new Employee1();
        }
        
        for (int j = 0; j <n; j++) {
            System.out.println("Masukkan detail data Karyawan"+(j+1)+":");
            emp[j].getData();
            System.out.println();
        }
        System.out.println("Detail karyawan yang telah diinputkan: ");
        System.out.println("id\tNama\tUmur\tGaji");
        for (int j = 0; j <n; j++) {
            emp[j].putData();
        }
    }
 
}
