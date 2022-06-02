/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglolista;

import java.util.ArrayList;

/**
 *
 * @author SONY VAIO
 */
public class Lista {
    
    public Nodo cabeza;
    public ArrayList<Nodo> arregloNodos;
    
    public Lista(){
        arregloNodos = new ArrayList<>();
    }
    //Unificar metodos agregarPrimerNodo con el metodo agregar
    public void agregar(Nodo nodo){
        if(cabeza != null){
            Nodo aux = cabeza;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nodo;
        }else{
            cabeza = nodo;
        }
    }
    //eliminar en la posicion n determinado elemento
    public void agregarNodoPosicionN(int index, Nodo nodo){
        this.arregloNodos.add(index, nodo);
    }
    public void imprimirNodo(){
        for (int i = 0; i < arregloNodos.size(); i++) {
            System.out.println(arregloNodos.get(i));
        }
    }

    //Eliminar el nodo n
    public String eliminarNodo(Nodo valorNodo){
        int posicionNodo = this.arregloNodos.indexOf(valorNodo);
        if(posicionNodo != -1){
            this.arregloNodos.remove(posicionNodo);
            return "Nodo eliminado";
        }else{
            return "No se ha encontrado el nodo";
        }
    }
    //Implementar el recorrido en dos vias
    
    //Determinar la longitud de la lista
    public int tamanioLista(){
        return this.arregloNodos.size();
    }
    //Devolver el elemento n
    public Nodo retornarElementoArray(int elemento){
        return this.arregloNodos.get(elemento);
    }
    // Determinar la piscion n de determinado elemento
    
    public String retornarPosicionElemento(Nodo valorBuscar){
        int posicionElemento = 0;
        posicionElemento = this.arregloNodos.indexOf(valorBuscar);
        if (posicionElemento != -1){
            return "El elemento se encuentra en la posicion: " + posicionElemento;
        }else{
            return "EL elemento no se encuentra en el arreglo";
        }
    }
    @Override
    public String toString(){
        if(cabeza!=null){
            Nodo aux = cabeza;
            String salida = "";
            while(aux != null){
                salida = salida + aux.toString();
                aux = aux.siguiente;
            }
            return salida;
        }
        return "Lista vacia";
    }
}
