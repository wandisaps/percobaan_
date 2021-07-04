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
public class TesKarMan {

    public static void main(String[] args) {

        Manager man = new Manager("Wirawan");
        System.out.println("Nama Manager = " + man.getNama());
        System.out.println("");
        Pegawai peg1 = new Pegawai();
        Pegawai peg2 = new Pegawai();
        Pegawai peg3 = new Pegawai();
        Pegawai peg4 = new Pegawai();
        Pegawai peg5 = new Pegawai();

        peg1.setNama("rian");
        peg2.setNama("Dian");
        peg3.setNama("Sian");
        peg4.setNama("Zian");
        peg5.setNama("Mian");

        peg1.setGaji(6000);
        peg2.setGaji(2000);
        peg3.setGaji(7000);
        peg4.setGaji(8000);
        peg5.setGaji(9000);

        peg1.tampilNamaGaji();
        peg2.tampilNamaGaji();
        peg3.tampilNamaGaji();
        peg4.tampilNamaGaji();
        peg5.tampilNamaGaji();
    }

}
