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
public class TestPegawai {

    public static void main(String[] args) {
        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pilihan Pegawai : \n1. Pegawai Tetap \n2. Pegawai Kontrak"));
        if (pilihan == 1) {
            String nama = JOptionPane.showInputDialog("Masukkan Nama Pegawai Tetap : ");
            int jam = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jam Pegawai Tetap : "));
            PegawaiTetap pt = new PegawaiTetap(nama, 4000000, jam);
            pt.jenisPegawai();
            pt.gaji();

        } else {
            String nama = JOptionPane.showInputDialog("Masukkan Nama Pegawai Kontrak: ");
            int jam = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jam Pegawai Kontrak : "));
            PegawaiKontrak pk = new PegawaiKontrak(nama, 3000000, jam);
            pk.jenisPegawai();
            pk.gaji();
        }
    }
}
