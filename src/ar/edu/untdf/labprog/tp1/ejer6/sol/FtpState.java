/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Cristian
 */
public interface FtpState {
    
    public void checkUser(String ruser);
    public void checkPasswd(String pass);
    public String getFile();
    public void close();
    
    
}
