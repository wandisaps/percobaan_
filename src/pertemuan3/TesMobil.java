/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import another_pertemuan3.Mobil;
/**
 *
 * @author LAB313-PC22
 */
public class TesMobil extends Mobil{
    public static void main(String[] args) {
        TesMobil  m1 = new TesMobil();
     
        
        m1.merek="Toyota";
        m1.warna="Hitam";
        
        System.out.println(m1.merek);
        System.out.println(m1.warna);
    }
}
