/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ylian
 */
public class ListaQueja {
    private ArrayList<Queja> lista;
    private boolean hayQuejas;
    
    public ListaQueja() {
        this.lista = new ArrayList<Queja>();
        this.hayQuejas = false;
    }
    
    public void agregarQueja(Queja unaQueja) {
        this.lista.add(unaQueja);
        this.hayQuejas = true;
    }
    
    public void quitarQueja(Queja unaQueja) {
        this.lista.remove(unaQueja);
        if (this.lista.size() == 0) {
            this.hayQuejas = false;
        }
    }
    
    public ArrayList<Queja> getLista() {
        return this.lista;
    }
    
    public boolean getHayQuejas() {
        return this.hayQuejas;
    }
    
    @Override
    public String toString() {
        if (this.hayQuejas) {
            return "Lista de quejas: " + this.lista;
        } else {
            return "No hay quejas.";
        }
    }
}
