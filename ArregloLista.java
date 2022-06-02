/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglolista;


/**
 *
 * @author SONY VAIO
 */
public class ArregloLista {

    public static void main(String[] args) {
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);
        Nodo n4 = new Nodo(4);        
        
        Lista le = new Lista();
        
        le.agregarNodoPosicionN(0,n1);
        le.agregarNodoPosicionN(1,n2);
        le.agregarNodoPosicionN(2,n3);
        le.agregarNodoPosicionN(3,n4);

        //Agregando lista doblemente enlazada               
        System.out.println("Lista doblemente enlazada");
        ListaDoble lista = new ListaDoble();
        lista.agregarInicio(10);
        lista.agregarFinal(5);
        lista.agregarFinal(9);
        lista.mostrarListaInicioFin();
        lista.mostrarListaFinInicio();
        
        //le.agregarNodoPosicionN(0, new Nodo(0));
        
        //le.imprimirNodo();
        //System.out.println(le.retornarPosicionElemento(n4));
        //System.out.println("El tamanio de la lista es: " + le.tamanioLista());
        //System.out.println(le.eliminarNodo(n4));
        //le.imprimirNodo();
        //System.out.println("El elemento del Nodo a devolver es: " + le.retornarElementoArray(1));
        //System.out.println(le);
    }
}
