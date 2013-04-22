/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Matias
 */
public class ListaInt {
    private Orden orden;
    private int[] lista;
    private Busqueda busqueda;
    
    public ListaInt(int[] list){
    lista=list;
    }
    	public Orden getOrden() {
        return orden;
    }


       public void setOrden(Orden orden) {
        this.orden = orden;
    }


        public int[] getLista() {
        return lista;
    }


        public void setLista(int[] lista) {
        this.lista = lista;
    }


        public void sort(int[] list) {
        this.orden.Orden(list);
        }

        public void printMe() {
        System.out.println();
        System.out.print("(");
        for (int x : lista) {
            System.out.print(x);
            System.out.print(" ");
        }
            System.out.print(")");
            System.out.println();
        }

        public Busqueda getBusqueda() {
        return busqueda;
        }

        public void setBusqueda(Busqueda busqueda) {
        this.busqueda = busqueda;
        }

        public boolean buscar(int[] a, int b){
            return this.busqueda.buscar(a, b);
        }
        
        public static void main(String[] args) {
            int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
            ListaInt l =new ListaInt(test);
            l.printMe();
            l.setOrden(new OrdenMergeSort());
            l.sort(test);
            l.printMe();
            
            int[] a = {3,6,8,10,9,20};
                ListaInt b = new ListaInt(a);
        b.setBusqueda(new Secuencial()); 
        if (b.buscar(a, 2)) {
        System.out.println("Existe el elemento");
        } else
        System.out.println("No existe el elemento");
        ;
}   
}