/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Cristian
 */
public class Secuencial implements Busqueda {
   
    @Override
    public boolean buscar(int[] a, int b) {
    return this.contains(a, b);
    }

    public boolean contains(int[] a, int b) {
    for (int i : a) {
    if (i == b) {
        return true;
    }
    }
    return false;
    }  
}
