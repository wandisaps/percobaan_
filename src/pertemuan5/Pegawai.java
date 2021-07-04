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
public class Pegawai {

    String nama;
    double gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilNamaGaji() {
        System.out.println("Nama Pegawai = " + getNama());
        System.out.println("Gaji = " + getGaji());
    }

}
