/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LAB313-PC22
 */
public class TestPenumpangPesawat {
    public static void main(String[] args) {
        int n,i;
        String nama,tujuan = null,jk,kelas;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah penumpang yang akan di inputkan");
        n = Integer.parseInt(input.nextLine());
        
  
        PenumpangPesawat penumpang[]= new PenumpangPesawat[n];
     
      
        for (int j = 0; j <n; j++) {
            penumpang[j]= new PenumpangPesawat();
        }
        

        for (int j = 0; j <n; j++) {
            System.out.println("Masukkan data penumpang"+(j+1));
            System.out.println("Masukkan nama penumpang");
            nama=input.nextLine();
            System.out.println("Masukkan jenis kelamin penumpang(L/P) : ");
            jk = input.nextLine();
            System.out.println("Masukkan tujuan Penumpang: ");
            tujuan = input.nextLine();
            System.out.println("Masukkan kelas penumpang: ");
            kelas = input.nextLine();
            
                 if (tujuan.equalsIgnoreCase("Indonesia")){
          tujuan = "Penerbangan tersedia";
      }else{
          tujuan = "Penerbangan tujuan ini dibatalkan pada masa pandemi";
      }
        
            System.out.println("");
            
            
        
            
            penumpang[j].setNama(nama);
            penumpang[j].setJk(jk);
            penumpang[j].setTujuan(tujuan);
            penumpang[j].setKelas(kelas);
        }
        
        //show data
        
        System.out.println("Detail penumpang yang telah di inputkan");
        System.out.println("Nama\tJK\tTujuan\tKelas");
        for (int j = 0; j <n; j++) {

        
            System.out.println(penumpang[j].getNama()+"\t"+penumpang[j].getJk()+"\t"+penumpang[j].getTujuan()+"\t"+penumpang[j].getKelas());
        }
    }
}
