/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglolista;

import javax.swing.JOptionPane;

/**
 *
 * @author SONY VAIO
 */
public class ListaDoble {
    private Nodo inicio, fin;
    public ListaDoble(){
        inicio = fin = null;
    }
    public boolean estaVacia(){
        return inicio == null;
    }
    //Add nodes
    public void agregarFinal(int dato){
        if(!estaVacia()){
            fin = new Nodo(dato, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio =fin= new Nodo(dato);
        }
    }
    //Method to add begin
    public void agregarInicio(int dato){
        if(!estaVacia()){
            fin = new Nodo(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio =fin= new Nodo(dato);
        }
    }
    //Method to add list
    public void mostrarListaInicioFin(){
        if(!estaVacia()){
            String datos = "<=>";
            Nodo auxiliar = inicio;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente; 
            }
            //Code to show dates
            System.out.println("Lista de inicio a fin = " + datos);
        }
    }
    //Method to show list from End to Begin
    public void mostrarListaFinInicio(){
        if(!estaVacia()){
            String datos = "<=>";
            Nodo auxiliar = fin;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior; 
            }
            //Code to show dates
            System.out.println("Lista de fin a inicio = " + datos);            
        }
    }
    
    
}
