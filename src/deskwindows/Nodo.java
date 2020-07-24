/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskwindows;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
class Nodo{
    protected Nodo siguiente;
    protected String nombre;
    protected Lista lista;

    public Nodo(String nombre,Nodo siguiente){
        this.nombre= nombre;
        this.siguiente = siguiente;
        this.lista = null;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public Lista  getLista(){
        return this.lista;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
   public void setLista(Lista lista){
        this.lista = lista;
    }

}

