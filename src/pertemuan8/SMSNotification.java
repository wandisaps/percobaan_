/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author USER
 */
public class SMSNotification implements Notifikasi {

    @Override
    public void sendMessage(String receiver, String content) {
       System.out.println("Mengirim sms ke: " + receiver + 
               " dengan isi pesan: " + content);
    }
    
}
