/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ylian
 */
public class Prueba {
    public static void main(String[] args) {
        Persona p1 = pedirPersona();
        Persona p2 = pedirPersona();
        Persona p3 = pedirPersona();
        Persona p4 = pedirPersona();
        Persona p5 = pedirPersona();
        
        ListaPersonas listaTotal = new ListaPersonas();
        listaTotal.agregarPersona(p1);
        listaTotal.agregarPersona(p2);
        listaTotal.agregarPersona(p3);
        listaTotal.agregarPersona(p4);
        listaTotal.agregarPersona(p5);
        
        ListaPersonas listaMayores = armarListaMayores(listaTotal);
        
        System.out.println("Lista de personas ingresadas mayores de 18 anios: \n" + listaMayores);
        System.out.println("Lista total de personas ingresadas: \n" + listaTotal);
        
    }
    
    public static Persona pedirPersona() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = in.nextLine();
        System.out.println("Ingrese una edad: ");
        int edad = in.nextInt();
        
        Persona nueva = new Persona(nombre, edad);
        
        return nueva;
    }
    
    public static ListaPersonas armarListaMayores(ListaPersonas listaTotal) {
        ListaPersonas listaMayores = new ListaPersonas();
        
        for (int p = 0; p < listaTotal.getLista().size(); p++) {
            Persona actual = listaTotal.getPersonaEnPos(p);
            if (actual.esMayor()) {
                listaTotal.agregarPersona(actual);
            }
        }
        
        return listaMayores;
    }
}
