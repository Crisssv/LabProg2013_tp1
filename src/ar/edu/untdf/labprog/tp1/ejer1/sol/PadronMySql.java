/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Cristian
 */
public class PadronMySql extends Padron {
    
    @Override
    Conn getConn() {
        return new MysqlConn();
    }
    
}
