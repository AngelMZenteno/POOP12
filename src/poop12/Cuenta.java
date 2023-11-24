/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Programa que simula una cuenta bancaria
 */
public class Cuenta extends Thread{
    private static long saldo=0;
    /**
     * Constructor que hereda el parametro name de Thread
     * @param name: nombre del hilo
     */
    public Cuenta(String name) {
        super(name);
    }
    /**
     * Sobrescritura metodo run()
     */
    @Override
    public void run(){
        if (getName().equals("Deposito 1") ||
                getName().equals("Deposito 2")){
        this.depositarDinero(100);
        
    } else{
            this.extraerDinero(50);
    }
        System.out.println("Termina el "+getName());
    }
    /**
     * Metodo depositarDinero que indica cuanto monto se agrega a la cuenta
     * @param cantidad: monto a depositar
     */
    public synchronized void depositarDinero(int cantidad) {
        System.out.println("El saldo actual es "+saldo);
        saldo+=cantidad;
        System.out.println("Se depostiaron "+cantidad+" pesos");
            notifyAll();
    }
    /**
     * Metodo extraerDinero que indica un retiro dado un monto y si no
     * hay suficiente dinero se produce una excepción
     * @param cantidad: monto a retirar 
     */
    public synchronized void extraerDinero(int cantidad){
        System.out.println("El saldo actual es "+saldo);
        try {
            if(saldo<=0){
                System.out.println(getName()+" espera deposito"+ "\n Saldo= " +saldo);
                sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println(e); 
        }
        saldo-=cantidad;
        System.out.println(getName()+" extrajo "+cantidad+ " pesos.\nSaldo restante "
                   +saldo);
            notifyAll();
    }
   
}
