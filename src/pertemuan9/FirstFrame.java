/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class FirstFrame implements ActionListener{
  
    JFrame f;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField t1, t2;
    JButton b;

    public FirstFrame() {
        f = new JFrame("First Frame");
        l1 = new JLabel("Nomor ke-1");
        l2 = new JLabel("Nomor ke-2");
        l3 = new JLabel("Hasil");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b = new JButton("Tombol Tambah");
        t1.setBounds(150, 50, 100, 30);
        t2.setBounds(150, 90, 100, 30);
        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 90, 100, 30);
        l3.setBounds(200, 150, 130, 30);
        b.setBounds(50, 150, 130, 30);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(l3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;
        l3.setText(value + "");
    }
}
