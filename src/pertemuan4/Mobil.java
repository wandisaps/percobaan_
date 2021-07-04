/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB313-PC22
 */
public class Mobil {
    String wrn;
    String merk;
    
    public Mobil(){
    }
    public void setData(){
        wrn = JOptionPane.showInputDialog("Inputkan warna kendaraan :");
        merk = JOptionPane.showInputDialog("Inputkan merek kendaraan :");
    }
    public void info(){
        System.out.println("Warna : "+wrn+"\nMerek"+merk);
    }
}
