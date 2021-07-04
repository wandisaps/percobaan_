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
public class TestKaryawan {

    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Ini adalah class Pegawai");
        Programmer p1 = new Programmer("Ini adalah class Programmer");

        System.out.println(k1.nama);
        System.out.println(p1.nama);

        k1.Aturan();
        k1.Gaji();

        p1.Aturan();
        p1.Gaji();
    }
}
