/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Programa que hereda de la clase Thrad e imprime que el nombre del
 * hilo está realizando ese numero de iteración
 */
public class HiloT extends Thread{
    /**
     * Constructor que hereda el parametro name de Thread
     * @param name: nombre del hilo
     */
    public HiloT(String name) {
        super(name);
    }
    /**
     * Sobreescritura del metodo run
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración "+i+" de "+getName());   
        }
        System.out.println("Termina el "+getName());
    }
    
    
}
