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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      public class Lingkaran extends BangunDatar {
  double  pi;
    double r;

    public Lingkaran(double pi, double r) {
        this.pi = pi;
        this.r = r;
    }

    public   Lingkaran(){
        this.r = this.pi;
    }
    
    @Override
    public double luas(){
        super.luas();
        return pi*r*r;
    }
    @Override
    public double keliling(){
        super.keliling();
        return 2*pi*r;
    }
}
