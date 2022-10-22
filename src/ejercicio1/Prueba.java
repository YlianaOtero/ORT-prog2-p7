package ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ylian
 */
public class Prueba {
    public static void main(String args[]) {
        Queja primerQueja = new Queja("No funciona el producto", 
                                      "Camino Cibils 5871", "096882764");
        Queja segundaQueja = new Queja("La aplicacion es muy lenta", 
                                      "Rincon 540", "099882462");
        Queja terceraQueja = new Queja("No puedo iniciar sesion", 
                                      "Iturriaga 1124", "099381661");
        
        ListaQueja miLista = new ListaQueja();
        miLista.agregarQueja(primerQueja);
        miLista.agregarQueja(segundaQueja);
        miLista.agregarQueja(terceraQueja);
        
        System.out.println(miLista);
        System.out.println();
        
        miLista.quitarQueja(primerQueja);
        
        System.out.println(miLista);
        System.out.println();
        
        miLista.quitarQueja(segundaQueja);
        miLista.quitarQueja(terceraQueja);
        
        System.out.println(miLista);
    }
}
