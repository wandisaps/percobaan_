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
public class TesPercobaan1 {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("102021");
        m1.setNama("Atika Kasya");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("102022");
        m2.setNama("Dito Faturahman");

        Dosen d = new Dosen();

        d.setKodeDosen("PJH");

        d.setNimMhs(m1.getNim());
        d.setNimMhs(m2.getNim());

        System.out.println("Dosen : ");
        System.out.println("Kode Dosen : " + d.getKodeDosen());
        System.out.println("Jumlah Mahasiswa : " + d.getJumlahMhs());
        for (int i = 0; i < 2; i++) {
            System.out.println("Nim Mahasiswa " + d.getNimMhs(i));
        }

    }
}
