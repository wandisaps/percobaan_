package Latihan_Modul_Praktikum6;
import javax.swing.JOptionPane;
public class PegawaiTetap {

    String nama;
    public int gaji, jenis, jam, bonus, tunjangan = 500000;
    int total;
    public PegawaiTetap(String nama,int gaji, int jam) {
        this.nama = nama;
        this.gaji = gaji;
        this.jam = jam;
    }

    public PegawaiTetap() {

    }

    public void jenisPegawai() {
        System.out.println("Nama Pegawai Tetap Adalah : "+nama);
        jenis = Integer.parseInt(JOptionPane.showInputDialog("Pilih Jenis Pegawai Tetap : \n1.Manager \n2.Kepala Bagian \n3.Staff Bagian Pemasaran"));
        switch (jenis) {
            case 1:
                System.out.println("Jenis Pegawai Adalah Manager");
                break;

            case 2:
                System.out.println("Jenis Pegawai Adalah Kepala Bagian");
                break;

            case 3:
                System.out.println("Jenis Pegawai Adalah Staff Bagian Pemasaran");
                break;
        }

    }

    public void gaji() {
        System.out.println("Gaji Pegawai Tetap Adalah Rp." + gaji);
        System.out.println("Tunjangan Pegawai Tetap Rp." + tunjangan);
        System.out.println("Jam Lembur Pegawai " + jam+" Jam");
        bonus = jam * 50000;
        System.out.println("Bonus Lembur Pegawai Adalah Rp." + bonus);
        total = gaji + tunjangan + bonus;
        System.out.println("Total Gaji Pegawai Tetap Adalah Rp. "+total);
    }
}
