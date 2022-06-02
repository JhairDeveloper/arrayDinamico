/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglolista;

/**
 *
 * @author SONY VAIO
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;
    public Nodo anterior;
    
    public Nodo(int numero){
        this.dato = numero;
        anterior = null;
        siguiente = null;
    }
    public Nodo(int numero, Nodo siguiente, Nodo anterior){
        this.dato = numero;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    @Override
    public String toString(){
        return " " + dato + " ";
    }
}

