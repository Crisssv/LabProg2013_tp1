/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Cristian
 */
public class PadronOracleConn extends Padron {
    
    Conn getConn(){
      return new OracleConn();
    }
    
}
