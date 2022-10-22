/*2) Escribir un programa que solicite los datos de personas (nombre y edad), los guarde en un ArrayList.
Mostrar luego los datos de las personas mayores de 18 y posteriormente los datos de todas las
personas.
 */
package Ejercicio2;

/**
 *
 * @author ylian
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String unNombre, int unaEdad) {
        this.nombre = unNombre;
        this.edad = unaEdad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public boolean esMayor() {
        return this.edad >= 18;
    }
    
    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ". Edad: " + this.edad;
    }
}
