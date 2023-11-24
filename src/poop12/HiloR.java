/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Programa que implementa la interfaz Runnable e imprime que el nombre del
 * hilo está realizando ese numero de iteración
 */
public class HiloR implements Runnable{
    /**
     * Sobreescritura del metodo run
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración "+i+" del "+Thread.currentThread().getName());  
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
    
}
