/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_Modul_Praktikum6;

/**
 *
 * @author LAB313-PC08
 */
public class Karyawan {
    String nama;
    protected int gaji=5000000;
    
    public Karyawan(){
        
    }
    public Karyawan(String nama){
        this.nama = nama;
    }
    public void Aturan(){
        System.out.println("Programmer datang tepat Waktu");
        System.out.println("Programmer mengisi absensi");
        System.out.println("Programmer meeting mingguan");
    }
    
    public void Gaji(){
        System.out.println("Programmer pokok Karyawan adalah "+ gaji);
    }
    
}
