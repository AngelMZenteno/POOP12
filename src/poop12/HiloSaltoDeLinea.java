/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Programa que imprime saltos de linea
 */
public class HiloSaltoDeLinea implements Runnable{
    /**
     * Sobreescritura del metodo run
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("\n");   
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    
    }
    
}
