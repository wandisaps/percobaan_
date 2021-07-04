/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Mahasiswa {
   int Nim;
   String Name;
   String Jurusan;
   
   
  public  void setData(){
       Scanner sc = new Scanner (System.in);
       
       System.out.println("\n\tMasukkan NIM: ");
       Nim= Integer.parseInt(sc.nextLine());
       
       System.out.println("\n\tMasukkan Nama");
       Name = sc.nextLine();
       
       System.out.println("\n\tMasukkan Jurusan");
        Jurusan = sc.nextLine();

   }
    public void putData(){
       System.out.println("\t"+Nim+"\t"+Name+"\t"+Jurusan);
   }
}
