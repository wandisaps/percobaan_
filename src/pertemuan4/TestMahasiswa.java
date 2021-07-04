/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author user
 */
public class TestMahasiswa {
    public static void main(String[] args) {  
     int n = 2;

        
        Mahasiswa[] Emp = new Mahasiswa[n];
        
        for (int j = 0; j <n; j++) {
            Emp[j] = new Mahasiswa();
        }
        
        for (int j = 0; j < n; j++) {
            System.out.println("\n Masukkan Mahasiswa Ke - "+(j+1));
            Emp[j].setData();
        }
        System.out.println("\nData Mahasiswa\n");
        for (int j = 0; j < n; j++) {
            Emp[j].putData();  
        }
        System.out.println("\n");
    }
}

