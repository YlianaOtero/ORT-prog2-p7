/* 2) Escribir un programa que solicite los datos de personas (nombre y edad), los guarde en un ArrayList.
Mostrar luego los datos de las personas mayores de 18 y posteriormente los datos de todas las
personas.
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author ylian
 */
public class ListaPersonas {
    ArrayList<Persona> lista;
    
    public ListaPersonas() {
        this.lista = new ArrayList<Persona>();
    }
    
    public ArrayList<Persona> getLista() {
        return this.lista;
    }
    
    public void agregarPersona(Persona unaPersona) {
        this.lista.add(unaPersona);
    }
    
    public Persona getPersonaEnPos(int pos) {
        return this.lista.get(pos);
    }
    
    @Override
    public String toString() {
        String personas = "";
        
        for (int p = 0; p < this.lista.size(); p++) {
            personas += this.getPersonaEnPos(p).toString() + "\n";
        }
        
        return personas;
    }
}
