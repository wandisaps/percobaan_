/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_Modul_Praktikum6;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PegawaiKontrak extends PegawaiTetap {
double uangtambahan,totalgaji;
String nama1;
    public PegawaiKontrak(String nama1, int gaji, int jam) {
        this.nama1 = nama1;
        this.gaji = gaji;
        this.jam = jam;
    }

    public PegawaiKontrak() {

    }

    @Override
    public void jenisPegawai() {
        System.out.println("Nama Pegawai Kontrak Adalah : "+ nama1);
        jenis = Integer.parseInt(JOptionPane.showInputDialog("Pilih Jenis Pegawai Tetap : \n1.Programmer \n2.Sistem Analyst "));
        switch (jenis) {
            case 1:
                System.out.println("Jenis Pegawai Adalah Programer");
                break;

            case 2:
                System.out.println("Jenis Pegawai Adalah Sistem Analyst");
                break;
        }
    }
    @Override
    public void gaji(){
        System.out.println("Gaji Pegawai Kontrak Adalah Rp. " + gaji);
        System.out.println("Jam Lembur Pegawai " + jam+" Jam");
        bonus = jam * 50000;
        System.out.println("Bonus Lembur Pegawai Kontrak  Adalah Rp. " + bonus);
        uangtambahan = gaji * 0.002;
        System.out.println("Uang Tambahan Pegawai Kontrak Adalah Rp. "+uangtambahan);
        totalgaji = gaji + bonus + uangtambahan;
        System.out.println("Total Gaji Pegawai Kontrak Adalah Rp. "+totalgaji);
    }
 
}
