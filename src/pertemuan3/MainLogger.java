/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import another_pertemuan3.Logger;
/**
 *
 * @author LAB313-PC22
 */
public class MainLogger {
   
    public static void main(String[] args) {
    Logger logger=new Logger();
    
    logger.debug("Debug with level"+logger.debugLevel);
    
    logger.debugLevel=20;
    logger.info("Info with level "+logger.debugLevel);    
    }
}
