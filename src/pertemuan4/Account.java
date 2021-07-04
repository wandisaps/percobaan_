/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author LAB313-PC22
 */
public class Account {
    int a,b;
    
    public Account(){
        this.a=0;
        this.b=0;
    }
    public void setNewData(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void showData(){
        System.out.println("Nilai Atribut a:"+this.a);
        System.out.println("Nilai Atribut b:"+this.b);             
    }
}
