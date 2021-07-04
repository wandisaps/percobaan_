/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author user
 */

import java.util.Random;

public class DemoHewan {
    public static void main(String[] args) {
        Hewan[] peliharaanku = {new Burung("Kakak Tua"), new Kambing("Etawa"), new Anjing("Kintami"), new Kucing("Anggora")};
        Hewan kesayangan;
        Random pilihan = new Random();
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        System.out.println("Binatang Kesayangan Anda : "+kesayangan);
        System.out.println("Suaranya : ");
        kesayangan.suara();
        }
    }

