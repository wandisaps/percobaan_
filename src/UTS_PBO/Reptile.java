/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_PBO;

/**
 *
 * @author user
 */
public class Reptile extends Hewan{
    String jenis_hewan;

    public Reptile(String jenis_hewan, String nama, String habitat, String namalatin) {
        super(nama, habitat, namalatin);
        this.jenis_hewan = jenis_hewan;
    }

   
     public void cetak(){
         System.out.println("Reptile");
     System.out.println("Jenis Hewan = "+jenis_hewan+"\nNama Hewan ="+nama+"\nHabitat = "+habitat+"\nNama Latin "+namalatin);
}
}