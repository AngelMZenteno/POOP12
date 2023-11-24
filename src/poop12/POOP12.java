/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Clase main
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**new Thread(new HiloCeros(),"Hilos ceros").start();
        new Thread(new HiloUnos(),"Hilos unos").start();
        new Thread(new HiloSaltoDeLinea(),"Hilos salto de linea").start(); */
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start(); 
       /** System.out.println("Termina el hilo principal");
        HiloT hilo1 = new HiloT("Primer Hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(),"Tercer Hilo").start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración "+i+" del main");   
        }
        System.out.println("Termina el Main"); */
    }
    
}
