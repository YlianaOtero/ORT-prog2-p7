/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author ylian
 */
import java.lang.String;
import java.util.Scanner;

public class Funcionario {
    private String nombre;
    private int sueldo;
    private int numero;
    
    public Funcionario() {
        this.nombre = "Sin nombre asignado";
        this.sueldo = 0;
    }
    
    public Funcionario(String unNombre, int unSueldo, int unNumero) {
        this.nombre = unNombre;
        this.sueldo = unSueldo;
        this.numero = unNumero;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    
    public int getSueldo() {
        return this.sueldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public void setSueldo(int unSueldo) {
        this.sueldo = unSueldo;
    }
    
    public void setNumero(int unNumero) {
        this.numero = unNumero;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ". Sueldo: " + this.sueldo + ". Numero: " + this.numero;
    }

}
