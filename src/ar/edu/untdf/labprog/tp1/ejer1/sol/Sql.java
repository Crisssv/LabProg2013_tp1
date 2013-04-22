/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author Cristian
 */
public class Sql {

    public void query (String type){
    
    Conn conn = null;
    conn.connect();
    conn.query("q");
   
    }
    public static void main (String args[])
    {
     PadronMySql p = new PadronMySql();
     p.ingresarMenores();
     PadronPostgressConn a = new PadronPostgressConn();
     a.ingresarMenores();
     PadronOracleConn b = new PadronOracleConn();
     b.ingresarMenores();
        
        
        
    }       
}
