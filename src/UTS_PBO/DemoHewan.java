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
public class DemoHewan {
    public static void main(String[] args) {
        
       Mamalia m = new Mamalia("mamalia", "paus", "air","paus");
       Reptile r = new Reptile("Reptile", "ular", "darat", "uler");
       
       m.cetak();
        System.out.println("----------------------------");
       r.cetak();
    }
}
