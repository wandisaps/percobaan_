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
public class Programmer extends Karyawan{
    String nama;
    int bonus = 2000000;
    int total;
    
    public Programmer(String nama){
        this.nama = nama;
    }
    public Programmer(){
        
    }
   
    @Override
    public void Aturan(){
        System.out.println("Programmer melakukan monitoring sistem perusahaan");
        System.out.println("Programmer melayani error complain");
    }
    
    @Override
    public void Gaji(){
        total = gaji + bonus;
        System.out.println("Bonus gaji adalah "+bonus);
        System.out.println("Total Gaji :"+total);
    }
}
