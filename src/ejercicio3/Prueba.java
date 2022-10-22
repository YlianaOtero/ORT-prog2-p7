/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author ylian
 */
public class Prueba {
    public static void main(String args[]) {
        Funcionario nuevo = new Funcionario("Yliana", 50000, 1);
        Funcionario nuevo2 = new Funcionario("Ejemplo", 4000, 2);
        Funcionario nuevo3 = new Funcionario("Ejemplo2", 70000, 3);
        
        ListaFuncionario lista = new ListaFuncionario();
        lista.agregarFuncionario(nuevo);
        lista.agregarFuncionario(nuevo2);
        lista.agregarFuncionario(nuevo3);
        
        System.out.println(lista);
       
    }
}
