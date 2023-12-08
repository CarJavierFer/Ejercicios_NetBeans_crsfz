/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_netbeans_crsfz;

/**
 * @author crsfz (Carlos Javier Ferrer Zapata)
 * Llamada sincronizada
 * Se crean dos subprocesos que simulan ser cada uno de ellos un ratón
   que come una cierta cantidad, siempre la misma de un plato.
 */
public class Ratones extends Thread {
    private static int Plato = 100;
    private final int Cantidadcomer;
    private boolean terminado;
    
    public Ratones(String nombre, int cantidadcomer) {
        super(nombre);
        this.Cantidadcomer = cantidadcomer;
        terminado = false;
    }
    
    synchronized public void comer() {
        Plato -= Cantidadcomer;
        System.out.println("-> " + this.getName() + " que come " + Cantidadcomer + " de su plato." + "\nQuedan " + Plato + " de comida.");
    }
    
    synchronized public void llenar() {
        Plato = 100;
        System.out.println("-> " + this.getName() + " llenar el plato con 100.");
    }
    
    @Override
    public void run() {
        do {
            if (Plato < Cantidadcomer) llenar();
            comer();
            
            try {
                synchronized (this) {
                    if (terminado) break;
                }
                
                Thread.sleep(100);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            
        } while (true);
        
    }
    
    public void terminar() {
        terminado = true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ratones Raton1 = new Ratones("Raton #1", 5);
        Ratones Raton2 = new Ratones("Raton #2", 10);
        
        System.out.println("==== Comenzar Subprocesos ====");
        System.out.println("Comida del plato: 100");
        Raton1.start();
        Raton2.start();
        
        try {
            Thread.sleep(1000);
            
            Raton1.terminar();
            Raton2.terminar();
            
            Raton1.join();
            Raton2.join();
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("==== Subprocesos terminados ====");
    }
} 
    

    

