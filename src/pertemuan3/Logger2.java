/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author LAB313-PC22
 */
public class Logger2 {
 protected int debugLevel = 1;

    public void debug(String logLine) {
        System.out.println("Debug: " + logLine);
    }

    public void info(String logLine) {
        System.out.println("Info: " + logLine);
    }
}
 