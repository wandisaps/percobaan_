/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author LAB313-PC22
 */
public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga();
        Persegi p1 = new Persegi();
        Persegi p2 = new Persegi();
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran();
        
        s1.nama="Siku-siku";
        s1.alas = 10;
        s1.tinggi = 15;
        p1.sisi = 5;
              
        l1.r=4;
        l1.pi=3.14;
        System.out.println("Nama Segitiga "+s1.nama);
        System.out.println("Luas Segitiga "+s1.luas());
        
        System.out.println("");
        s2.nama ="Sama Sisi";
        s2.sisi1 = s2.sisi2 = s2.sisi3=100;
        System.out.println("Nama Segitiga: "+s2.nama);
        System.out.println("Keliling Segitiga: "+s2.keliling());
        System.out.println("");
        
        
        System.out.println("Luas Persegi :"+p1.luas());
        System.out.println("Keliling Persegi :"+p1.keliling());
        System.out.println("");
        System.out.println("Luas lingkaran "+l1.luas());
        System.out.println("Keliling Lingkaran "+l1.keliling());
    }
}
