/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Cristian
 */
public abstract class Padron {
    abstract Conn getConn();
    
    public void ingresarMenores() {
        
       Conn c = getConn();
       c.connect();
       c.query(" ");
    }
    
}
