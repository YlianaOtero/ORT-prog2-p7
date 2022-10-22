/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author ylian
 */
public class Queja {
    private String denuncia;
    private String direccion;
    private String telefono;
    private int numero;
    
    private static int UltimoNumero = 0;
    
    public Queja(String unaDenuncia, String unaDireccion, String unTelefono) {
        this.denuncia = unaDenuncia;
        this.direccion = unaDireccion;
        this.telefono = unTelefono;
        this.numero += UltimoNumero;
    }
    
    public String getDenuncia() {
        return this.denuncia;
    }
    
    public void setDenuncia(String unaDenuncia) {
        this.denuncia = unaDenuncia;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String unTelefono) {
        this.telefono = unTelefono;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public int getUltimoNumero() {
        return UltimoNumero;
    }
    
    @Override
    public String toString() {
        return "Denuncia: " +this.denuncia +". Direccion: " +this.direccion 
                +". Telefono: " +this.telefono +".";
    }
    
   
}
