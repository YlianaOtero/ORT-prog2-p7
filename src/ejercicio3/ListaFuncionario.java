/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ylian
 */

public class ListaFuncionario {
    private ArrayList<Funcionario> lista;
    private int sueldoMayor;
    private int cantSueldoMayorN;
    
    private static int N = 10000;
    
    public ListaFuncionario() {
        this.lista = new ArrayList<Funcionario>();
        this.sueldoMayor = 0;
        this.cantSueldoMayorN = 0;
    }
    
    public ArrayList<Funcionario> getLista() {
        return this.lista;
    }
    
    public int getSueldoMayor() {
        return this.sueldoMayor;
    }
    
    public int getCantSueldoMayorN() {
        return this.cantSueldoMayorN;
    }
    
    public void agregarFuncionario(Funcionario unFuncionario) {
        this.lista.add(unFuncionario);
        this.setSueldoMayor();
        this.setCantSueldoMayorN();
    }
    
    private void setSueldoMayor() {
        int mayor = 0;
        
        ArrayList<Funcionario> miLista = this.lista;
        
        for (int i = 0; i < this.lista.size(); i++) {  
            Funcionario persona = miLista.get(i);
            if (persona.getSueldo() > mayor) {
                
                mayor = persona.getSueldo();
            }
        }
        
        this.sueldoMayor = mayor;
    }
    
    private void setCantSueldoMayorN() {
        int cant = 0;
        
        ArrayList<Funcionario> miLista = this.lista;
        
        for (int i = 0; i < this.lista.size(); i++) {
            Funcionario persona = miLista.get(i);
            if (persona.getSueldo() > N) {
                cant++;
            }
        }
        
        this.cantSueldoMayorN = cant;
    }
    
    @Override
    public String toString() {
        return "Lista: " + this.lista + ". Sueldo mayor: " + this.sueldoMayor + 
                ". Cantidad con sueldo mayor a " +N+ ": " + this.cantSueldoMayorN;
    }

}
