/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author LAB313-PC22
 */
public class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public Persegi(){
        this.sisi=0;
        
    }
    @Override
    public double luas(){
        super.luas();
        return sisi*sisi;
    }
    
    @Override
    public double keliling(){
        super.keliling();
        return 4*sisi;
    }
}
